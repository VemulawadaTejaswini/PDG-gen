import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    	Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int data[] = new int[n];
      for(int i = 0; i < n; i++) {
      	 data[i] = sn.nextInt();
      }
      int a = 0;
      int b = 0;
      int c = 0;
      int res = 0;
      for(int i = 0; i < n ; i++) {
        a = data[i];
        for(int j = i + 1; j < n; j++) {
          b = data[j];
          for(int k = j + 1; k < n; k++) {
           c = data[k];
          	if( (a + b > c)  && (b  + c > a)  && (a + c > b) && (a !=b) && (a!=c)&& (b!=c)) {
       			res++; 	
        	}
          }
        }
      }
      System.out.println(res);
    }
}