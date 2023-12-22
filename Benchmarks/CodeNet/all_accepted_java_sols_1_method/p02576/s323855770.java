import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
         int x =scn.nextInt();
          int t= scn.nextInt();
          int val = n/x;
          if(n%x!=0){
        	  val++;
          }
          System.out.println(val*t);
	}

}