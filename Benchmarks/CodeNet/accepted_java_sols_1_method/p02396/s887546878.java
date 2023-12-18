import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;

		for(int t=1;;t++) {
			int num=sc.nextInt();

			if(num==0) {
				break;
			}else {
				System.out.println("Case "+t+":"+" "+num);
			}
		}


	}
}

