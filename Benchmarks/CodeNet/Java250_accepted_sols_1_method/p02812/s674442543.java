import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.next());
      	int cnt = 0;
      	if (N != 0) {
        	String s = sc.next();
  			s = s.replace("ABC", "0");
          	char[] a = s.toCharArray();
          	for (int i = 0; i < a.length; i++) {
            	if (a[i] == '0') { cnt++; }
            }
        }
      	System.out.println(cnt);
    }
}