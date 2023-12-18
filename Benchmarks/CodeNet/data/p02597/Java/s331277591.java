import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String str = sc.next();
      	int x = 0;
      	int c = 0;
      	int rw = 0;//右にある白の数
      	int ans = 0;
      	
      	for (int i = 0; i < n - 1; i++) {
        	if (str.charAt(i)=='W') {
              	x++;
            } else {
              	x++;
              	break;}
        }
      	for (int j = x; j < n; j++) {
          	if (str.charAt(j)=='W') {rw++;}
          	
        	if ((str.charAt(j)=='R')&&(rw != 0)) {c++;}
        }
      	
      	ans = (x-1) + Math.max(c - x + 1, 0);
      	System.out.println(c);
    }
}