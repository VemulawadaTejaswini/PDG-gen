import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//目標
      	double x = sc.nextDouble();//一回あたり
      	double t = sc.nextDouble();//時間
   
    	System.out.println((int)(Math.ceil(n/x)*t));
    } 
}

















