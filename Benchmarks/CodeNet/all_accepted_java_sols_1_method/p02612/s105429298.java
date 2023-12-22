import java.util.Scanner;
public class Main{
	public static void main(String[] agrs){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int satu = 1000;
		while(true){
			if(satu - n < 0){
				satu += 1000;
			}
			else{
				System.out.print(satu - n);
				break;
			}
		}
	}
}