import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	Set<String> set = new HashSet<>();

    	for (int s = 1; s <= 13; s++) {
    		set.add("S " + s);
    	}

    	for (int h = 1; h <= 13; h++) {
    		set.add("H " + h);
    	}

    	for (int c = 1; c <= 13; c++) {
    		set.add("C " + c);
    	}

    	for (int d = 1; d <= 13; d++) {
    		set.add("D " + d);
    	}
		
      	int x = Integer.parseInt(br.readLine());
      	for(int i = 0; i < x; i++) {
          	String y = br.readLine();
          	set.remove(y);
        }
      
      	int size = set.size();
      	// S H C DのListを作る
      	List<Integer> S = new ArrayList<>();
      	List<Integer> H = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> D = new ArrayList<>();
      
      	for (int i = 0; i < size; i++) {
          	String z = String.valueOf(set.toArray()[i]);
        	if (z.contains("S")) {
              	int sn = Integer.parseInt(z.split(" ")[1]);
            	S.add(sn);
            } 
            if (z.contains("H")) {
              	int hn = Integer.parseInt(z.split(" ")[1]);
            	H.add(hn);
            }
          	if (z.contains("C")) {
                int cn = Integer.parseInt(z.split(" ")[1]);
            	C.add(cn);
            }
          	if (z.contains("D")) {
                int dn = Integer.parseInt(z.split(" ")[1]);
            	D.add(dn);
            }
          
        }
      
      	Collections.sort(S);
      	Collections.sort(H);
      	Collections.sort(C);
      	Collections.sort(D);

      	for(int s: S) {
        	System.out.println("S " + s);
        }
      	for(int h: H) {
        	System.out.println("H " + h);
        }
      	for(int c: C) {
        	System.out.println("C " + c);
        }
      	for(int d: D) {
        	System.out.println("D " + d);
        }
        
      	

    }
}
