import java.util.Scanner;
class Main
{

 public static void main(String[] args) 
 {
   int A;
   int B;

	Scanner scan = new Scanner(System.in);
	A = scan.nextInt();
	B = scan.nextInt();

	if(A>=2*B)
		System.out.println(A-2*B);
	else 
	  System.out.println(0);
 }
}