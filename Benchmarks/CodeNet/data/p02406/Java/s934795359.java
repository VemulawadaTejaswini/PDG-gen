import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = imput.nextInt();
		int i = 1;
		while(i <= n){
			int x = i;
			if(x%3 == 0){
				System.out.print(" "+i);
				i++;
				continue;
			}else if(x%10 == 3){
				System.out.print(" "+i);
				i++;
				continue;
			}else if(x / 10 != 0){
				if(x%10 == 3){
					System.out.print(" "+i);
					i++;
					continue;
				}
			}
		}
		System.out.println("");
	}
}