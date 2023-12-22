import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int A =sc.nextInt();
		 int B =sc.nextInt();
		 //i*0.08とi*0.1が等しくなるまで繰り返す
		 for(int i=1; i<=100000; i++) {
		 if((int)(i*0.08)==A && (int)(i*0.1)==B) {
			 System.out.println(i);
			 return;
		 	}
		 }	//なかった場合は-1を表示
			 System.out.println("-1");
    }
}