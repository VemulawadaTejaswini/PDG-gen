import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long x[] = new long[3];
		int a=0, b=0;
		
		for(int i=0; i<3; i++){
			x[i] = sc.nextLong();
			if (x[i]==5){
				a++;
			}
			else if (x[i]==7){
				b++;
			}
		}
		
		if(a==2 && b==1){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");

		}
		
		
//		System.out.println(num[0]);


	}
}
