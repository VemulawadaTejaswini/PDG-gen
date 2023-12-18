import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		HashMap<Integer,Integer> mapA = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapB = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean state = false;
		while(stdIn.hasNext()) {
			String data = stdIn.nextLine();
			if(data.equals("")) {
				state = true;
				continue;
			}
			
			String[] tmp = data.split(",");
			int id = Integer.parseInt(tmp[0]);
			int count = Integer.parseInt(tmp[1]);
			if(!state) {
				if(mapA.containsKey(id)) {
					mapA.put(id, mapA.get(id)+1);
				}
				else {
					list.add(id);
					mapA.put(id, 1);
				}
			}
			else {
				if(mapB.containsKey(id)) {
					mapB.put(id, mapB.get(id) + 1);
				}
				else {
					list.add(id);
					mapB.put(id, 1);
				}
			}
			
			
		}
		
		Collections.sort(list);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i-1).intValue() == list.get(i).intValue()) {
				System.out.println(list.get(i) + " " + (mapA.get(list.get(i)) + mapB.get(list.get(i))));
				i++;
			}
		}
		
		out.flush();
	}

}
//------------------------------//
//-----------//
class FastScanner {
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