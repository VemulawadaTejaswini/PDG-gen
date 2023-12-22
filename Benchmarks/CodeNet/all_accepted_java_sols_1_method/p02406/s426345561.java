import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();

		for(int i=3;i<=n;i++){
			if(i%3 == 0){
				System.out.print(" "+i);
			}else{

			int a = i;
			if(a/1000 == 3){
				System.out.print(" "+i);
			}else{
				a =a - a/1000 *1000;
				if(a/100==3){
					System.out.print(" "+i);
				}else{
						a =a - a/100 *100;
						if(a/10==3){
							System.out.print(" "+i);
						}else{
							a = a -a/10*10;
							if(a==3){
								System.out.print(" "+i);

							}
						}
					}
				}
			}
		}


		System.out.println();
	}
}