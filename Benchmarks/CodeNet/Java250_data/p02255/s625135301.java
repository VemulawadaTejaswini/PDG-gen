import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static void print(int[] A){
		String[] V=new String[A.length];
		for(int i=0;i<A.length;i++){
			V[i]=String.valueOf(A[i]);
		}
		System.out.println(String.join(" ",V));
	}
	
	public static void insertionSort(int[] A,int N){ // N??????????´??????????0-?????????????????????
	   for(int i=0;i<A.length;i++){
		 
	     int v = A[i];
	     int j = i - 1;
	     while(j >= 0 && A[j] > v){
	       A[j+1] = A[j];
	       j--;
	     }
	     A[j+1] = v;
	     print(A);
	   }
	}
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	int[] A=new int[Integer.parseInt(line)];
            	line=br.readLine();
            	String[] str=line.split(" ");
            	for(int i=0;i<A.length;i++){
            		A[i]=Integer.parseInt(str[i]);
            	}
            	insertionSort(A,A.length);
            	break;
            }
        }
	}
}