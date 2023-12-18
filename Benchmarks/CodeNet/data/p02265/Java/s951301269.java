import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        DList dl = new DList();
        int n = in.readInt();
         
        for(int i=0; i<n; i++) {
            String[] cmd = in.br.readLine().split(" ");
            if(cmd[0].equals("insert")){
            	dl.insert(Integer.parseInt(cmd[1]));
            } else if(cmd[0].equals("delete")){
            	dl.delete(Integer.parseInt(cmd[1]));
            } else if(cmd[0].equals("deleteFirst")){
            	dl.deleteFirst();
            } else {
            	dl.deleteLast();
            }
        }
        out.println(dl.listToString());
        out.flush();
    }
}
 
class DList {
    public DListElement head = null;
    public DListElement tail = null;
    
    public HashMap<Integer,LinkedList<DListElement>> map = new HashMap<>();
    
    public void insertMap(DListElement dle) {
    	if(map.containsKey(dle.value)){
    		map.get(dle.value).addFirst(dle);
    	} else {
    		LinkedList<DListElement> ll = new LinkedList<>();
    		ll.addFirst(dle);
    		map.put(dle.value,ll);
    	}
    }
    
    public DListElement deleteFirstMap(Integer key) {
    	if(map.containsKey(key)){
    		return map.get(key).removeFirst();
    	} else {
            throw new IllegalStateException();
    	}
    }
    
    public DListElement deleteLastMap(Integer key) {
    	if(map.containsKey(key)){
    		return map.get(key).removeLast();
    	} else {
            throw new IllegalStateException();
    	}
    }
    
    public void insert(int x) {
    	DListElement dle = new DListElement(x);
    	dle.next = head;
        if(head != null) {
            head.prev = dle;
        }
        head = dle;
        if(tail == null) {
            tail = head;
        }
        insertMap(dle);
    }
     
    public void deleteFirst() {
        if(head == null) throw new IllegalStateException();
        deleteFirstMap(head.value);
        head = head.next;
        if(head == null)
            tail = null;
        else
            head.prev = null;
    }
     
    public void deleteLast() {
        if(tail == null) throw new IllegalStateException();
        deleteLastMap(head.value);
        tail = tail.prev;
        if(tail == null)
            head = null;
        else
            tail.next = null;
    }
     
    public void delete(int x) {
    	DListElement dle = deleteFirstMap(x);
        if(dle == head) {
            head = head.next;
            if(head == null)
                tail = null;
            else
                head.prev = null;
        } else if(dle == tail) {
            tail = tail.prev;
            if(tail == null)
                head = null;
            else
                tail.next = null;
        } else {
        	dle.prev.next = dle.next;
        	dle.next.prev = dle.prev;
        }
    }
     
    public String listToString() {
        StringBuilder sb = new StringBuilder();
        for(DListElement now = head; now != null; now = now.next) {
            if(now.prev != null) {
                sb.append(" ");
            }
            sb.append(now.value);
        }
        return sb.toString();
    }
}

class DListElement {
    int value = -1;
    DListElement next = null;
    DListElement prev = null;
     
    public DListElement(int x) {
        value = x;
    }
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
        return br.readLine().split(delim);
    }
     
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}