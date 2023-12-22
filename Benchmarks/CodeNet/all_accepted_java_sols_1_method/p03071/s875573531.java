import java.util.Scanner;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
      	int A = scanner.nextInt();
      	int B = scanner.nextInt();
      	int sum = Math.max(A,B);
      	if (A > B) A--;
        else B--;
      	sum += Math.max(A,B);
      	System.out.println(sum);
    }
}