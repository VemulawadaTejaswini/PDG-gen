
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int num=0;
		int m=n;
		boolean checker=false;
		while(m!=0){
		num=m%10;
		if(num==7) {checker = true;break;}
		m=m/10;
		}
		System.out.println(checker==true?"Yes":"No");

	}

}
