import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int min = 0;
		int max = 0;
		long amount = 0;

		for(int i = 0; i < n; i++){
			int x = scan.nextInt();
			if(i == 0){
				min = x;
				max = x;
				amount = x;
			}else{
				if(x < min){
					min = x;
				}else if(x > max){
					max = x;
				}
				amount = amount + x;
			}
		}
		System.out.println(min + " " + max + " " + amount);
	}
}