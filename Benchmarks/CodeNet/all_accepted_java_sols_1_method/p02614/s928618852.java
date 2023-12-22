import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	int k = sc.nextInt();
      	
      	char[][] M = new char[h][w];
      	for (int i=0; i<h; i++) {
          	String s = sc.next();
        	for (int j=0; j<w; j++) {
            	M[i][j] = s.charAt(j);
            }
        }
      	
      	int c = 0, black_counter = 0;//counter
      	String r, l;
      	for (int i=0; i<(int)Math.pow(2, h); i++) {
        	for (int j=0; j<(int)Math.pow(2, w); j++) {
              	black_counter = 0;
            	r = Integer.toBinaryString(i);
              	l = Integer.toBinaryString(j);
              	int x = 0, y = 0;
              	while (r.length()<h) {r = '0' + r; x++;}
              	while (l.length()<w) {l = '0' + l; y++;}
              
              
              	for (int m=0; m<h; m++) {
                  	for (int n=0; n<w; n++) {
                    	if ((r.charAt(m)=='0')&&(l.charAt(n)=='1')&&(M[m][n]=='#')) {
                          	black_counter++;
                        }
                    }
                }
              	if (black_counter==k) {c++;}
            }
        }
      	System.out.println(c);
    }
}