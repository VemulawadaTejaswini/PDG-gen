import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		FScan cin=new FScan();
		int n=(int)(cin.nextLong());
		DLinkedList list=new DLinkedList();
		for(int i=0;i<n;i++) {
			String str=cin.next();
			if(str.equals("insert")) {
				int x=Integer.parseInt(cin.next());
				list.insert(x);
			}
			else if(str.equals("delete")) {
				int x=Integer.parseInt(cin.next());
				list.deleteFact(x);
			}
			else if(str.equals("deleteFirst"))list.deleteFirst();
			else if(str.equals("deleteLast"))list.deleteLast();
			//System.out.println(i);
		}
		
		PrintWriter out=new PrintWriter(System.out);
		
		int lim=list.size();
		Cell c=list.dummy.getNext();
		for(int i=0;i<lim;i++) {
			if(i==lim-1)out.println(c.data);
			else out.print(c.data+" ");
			c=c.getNext();
		}
		out.flush();
	}

}

class FScan {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}

class Cell{
	int data=-1;
	Cell next;
	Cell prev;
	
	Cell(int x){
		data=x;
	}
	
	void setNext(Cell next) {
		this.next=next;
	}
	
	Cell getNext() {
		return next;
	}
	
	void setPrev(Cell prev) {
		this.prev=prev;
	}
	
	Cell getPrev() {
		return prev;
	}
	
	int getData() {
		return data;
	}
}

class DLinkedList{
	Cell dummy;
	int size;
	
	DLinkedList(){
		dummy=new Cell(-1);
		dummy.setNext(dummy);
		dummy.setPrev(dummy);
		size=0;
	}
	
	void insert(int data) {
		Cell c=new Cell(data);
		c.setNext(dummy.getNext());
		c.setPrev(dummy);
		dummy.getNext().setPrev(c);
		dummy.setNext(c);
		size++;
	}
	
	void deleteFirst() {
		Cell c=dummy.getNext();
		if(c==dummy)return;
		c.getNext().setPrev(c.prev);
		c.getPrev().setNext(c.getNext());
		size--;
	}
	
	void deleteLast() {
		Cell c=dummy.getPrev();
		if(c==dummy)return;
		c.getNext().setPrev(c.getPrev());
		c.getPrev().setNext(c.getNext());
		size--;
	}
	
	boolean deleteFact(int x) {
		Cell c=dummy.getNext();
		for(int i=0;i<size;i++) {
			if(c.getData()==x) {
				c.getNext().setPrev(c.getPrev());
				c.getPrev().setNext(c.getNext());
				size--;
				return true;
			}
			c=c.getNext();
		}
		return false;
	}
	
	int size() {
		return size;
	}
}
