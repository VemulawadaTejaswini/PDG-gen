import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int kokugoday=A/C;
		int sansuday=B/D;
		if(A%C!=0){
			kokugoday++;
		}
		if(B%D!=0){
			sansuday++;
		}
		if(kokugoday<sansuday){
			System.out.println(L-sansuday);
		}
		else{
			System.out.println(L-kokugoday);
		}
	}
}