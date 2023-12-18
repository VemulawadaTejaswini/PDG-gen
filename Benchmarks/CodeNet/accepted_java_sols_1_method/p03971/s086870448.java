import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int a = 0;
		int b = 0;

	   for(int i = 0;i<S.length;i++){
		   if(S[i]=='a' && (a+b)<(A+B)){
			   a++;
			   System.out.println("Yes");
		   }else if(S[i]=='b' && b<B && (a+b)<(A+B)){
			   b++;
			   System.out.println("Yes");
		   }else{
			   System.out.println("No");
		   }
	   }
	}
}