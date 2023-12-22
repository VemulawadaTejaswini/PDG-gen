import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    	Scanner sn = new Scanner(System.in);
      String s = sn.next();
      String[] a = s.split("");
      int max = 0;
      int aux = 0;
      for(int i = 0; i < a.length; i++) {
      	if(a[i].equals("R")) {
        	aux++;
          	max = Math.max(max, aux);
        } else {
          	aux = 0;
        }
      }
      System.out.println(max);
    }
}