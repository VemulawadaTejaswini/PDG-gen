import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		int i = 0;
		while(true){
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if(x == 0){
				break;
			}
			i++;
			System.out.println("Case" +(i)+": "+(x)+"");
			}
		}
	}
			