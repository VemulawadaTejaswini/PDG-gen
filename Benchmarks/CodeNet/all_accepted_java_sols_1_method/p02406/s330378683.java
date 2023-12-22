import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x;
		for (int a=3;a<=n;a++){
			if(a%3==0){System.out.print(" "+a);continue;}
			x=a;
			while(x!=0){
				if(x%10==3){System.out.print(" "+a);break;}
				x=x/10;
			}
		}
		System.out.println("");
	}
}