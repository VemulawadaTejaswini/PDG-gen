
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int s;
   int n = input.nextInt();
   int k = input.nextInt();
   int x = input.nextInt();
   int y = input.nextInt();
 s=Math.min(n,k) * x +Math.max(n-k,0)*y;
 System.out.println(s);
   
}}