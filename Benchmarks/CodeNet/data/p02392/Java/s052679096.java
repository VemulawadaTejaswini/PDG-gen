import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>0 && b>0 && c>0 && a<=100 && b<=100 && c<=100){
			if(a<b && b<c && c>a){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}

}

