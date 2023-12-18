import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt() / 50;
		int count = 0;
		for(int i=0; i<=a; i++){
			for(int j=0; j<=b; j++){
				for(int k=0; k<=c; k++){
					if(10*i + 2*j + k == x){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
