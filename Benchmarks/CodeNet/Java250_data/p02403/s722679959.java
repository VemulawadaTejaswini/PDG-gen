import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner (System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		while (h!=0 || w!=0){
			for (int i=1;i<=h;++i){
				for (int j=1;j<=w;++j){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			h=sc.nextInt();
			w=sc.nextInt();
		}

	}
}
