import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		while(red >= green){
			if(k > 0){
				green *= 2;
				k--;
			}else{
				System.out.println("No");
				return;
			}
		}
		while(green >= blue){
			if(k > 0){
				blue *= 2;
				k--;
			}else{
				System.out.println("No");
				return;
			}
		}

		if((red < green) && (green < blue)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
