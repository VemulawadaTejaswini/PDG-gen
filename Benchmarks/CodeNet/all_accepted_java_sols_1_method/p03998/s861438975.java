import java.util.*;

class Main {
  	static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
		char[] as = sc.next().toCharArray(), 
			   bs = sc.next().toCharArray(),
			   cs = sc.next().toCharArray();
      
      	int a = 0, b = 0, c = 0;
      	int w = 'a';
      
      	while (true) {
        	switch (w) {
              case 'a':
                if (a == as.length) { System.out.println("A"); return; }
                w = as[a];
                a++;
                break;
              case 'b':
                if (b == bs.length) { System.out.println("B"); return; }
                w = bs[b];
                b++;
                break;
              case 'c':
                if (c == cs.length) { System.out.println("C"); return; }
                w = cs[c];
               	c++;	
                break;
            }
        }
    }
}