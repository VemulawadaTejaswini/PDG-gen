import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	String s = sc.next();
        char[] color = new char[n];
        for (int i=0; i<n; i++) {
        	color[i] = s.charAt(i);
        }
		
        int count = 0;
      
        int i = 0;
        while (i<n-1) {
          	boolean isSame = true;
            int j = 1;
          while (isSame) {      
        	if (i+j < n && color[i+j] == color[i]) {
              count++;
              j++;
            } else {
              isSame = false;
            }
          }
			i = i+j;
        }
      
        System.out.println(n-count);      
	}
}