import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			int A_size;
			
			while(true){
				/* input from here */
				String line = r.readLine();
				String[] temp;
				A_size = Integer.parseInt(line);
				long[] A = new long[A_size];	
				if(A_size==0){
					break;
				} else {				
					temp = r.readLine().split(" ");
					for(int i=0;i<A_size;i++){
						A[i] = Long.parseLong(temp[i]);
					}
				}
				/* input till here */
				/* processing from here */
				//hash to store count of each input integer
				HashMap<Long,Integer> count = new HashMap<Long,Integer>();
				
				for(int i=0;i<A_size;i++){
					if(count.containsKey(A[i])){
						int t = count.get(A[i]);
						t++;
						count.put(A[i], t);
					} else {
						count.put(A[i], 1);
					}
				}
				
				/* processing till here */
				/* output */
				boolean nosol = true;
				for(Long key : count.keySet()){
					if(count.get(key) > A_size/2){
						System.out.println(key);
						nosol = false;
						break;
					}
				}
				if(nosol){
					System.out.println("NO COLOR");
				}		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}