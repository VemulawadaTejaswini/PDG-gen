import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
  
public class Main {
    private static final String CRLF = System.lineSeparator();
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int N = in.readInt();
        Card[] org = Card.createCardArray(in.readStrArray(" "),N);
        cardArrayToString(
        		bubbleSort(
        				Arrays.copyOf(org , org .length)
        				), 
        		sb, 
        		org);
        cardArrayToString(
        		selectionSort(
        				Arrays.copyOf(org , org .length)
        				), 
        		sb, 
        		org);
        out.print(sb.toString());
        out.flush();
    }
    
    private Card[] selectionSort(Card[] A){
    	for(int i=0; i<A.length; i++) {
    		int minj = i;
    		for(int j=i; j<A.length; j++){
    			if(A[j].compareTo(A[minj]) < 0)
    				minj=j;
    		}
			if(i!=minj){
            	swap(A,i,minj);
			}
    	}
    	return A;
    }
    
    private Card[] bubbleSort(Card[] A) {
    	for(int i=0;i<A.length;i++) {
        	for(int j=A.length-1;i<j;j--) {
        		if(A[j].compareTo(A[j-1]) < 0){
                	swap(A,j,j-1);
        		}
        	}
    	}
    	return A;
    }
    
    private void swap(Card[] A, int i, int j) {
    	Card tmp = A[i];
    	A[i] = A[j];
    	A[j] = tmp;
    }
    
    private boolean checkStable(Card[] org, Card[] sorted) {
    	HashMap<String,Integer> hc = new HashMap<>();
    	for(int i=0; i<org.length; i++) {
    		hc.put(org[i].str, i);
    	}
    	for(int i=1; i<sorted.length; i++) {
    		if(sorted[i-1].num==sorted[i].num){
    			if(hc.get(sorted[i-1].str) > hc.get(sorted[i].str)) {
        			return false;
    			}
    		}
    	}
    	return true;
    }
    
    private void cardArrayToString(Card[] sorted, StringBuilder sb, Card[] org) {
        for(int i=0; i<sorted.length; i++) {
            if (i>0)
                sb.append(" ");
            sb.append(sorted[i]);
        }
        sb.append(CRLF).append(checkStable(org,sorted)?"Stable":"Not stable").append(CRLF);
    }
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}

class Card implements Cloneable {
	public static Card[] createCardArray(String[] sArray, int N) {
		Card[] c = new Card[N];
		for(int i=0; i<N; i++) {
			c[i] = new Card(sArray[i]);
		}
		return c;
	}
	
	String str = "";
	int num = 0;
	
	private Card(){}
	public Card(String str) {
		this.str = str;
		num = str.charAt(1) - '0';
	}
	
	public Card clone() {
		Card c = new Card();
		c.str = this.str;
		c.num = this.num;
		return c;
	}
	public int compareTo(Card arg0) {return Integer.compare(this.num, arg0.num);}
	public String toString() {return str;}
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int readInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
//    public int[] readIntArray(int len) throws NumberFormatException, IOException{
//        int[] a = new int[len];
//        int i=0;
//        for(String s: br.readLine().split(" ")){
//            a[i++] = Integer.parseInt(s);
//        }
//        return a;
//    }
    
}