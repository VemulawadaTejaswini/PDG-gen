import java.util.Scanner;

public class Main4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i = 1; ; i++){
			int x = sc.nextInt();
			switch (x){
				case 0:
					break;
				default :
					System.out.println("Case i:%d",x);
			}
		}
	}
}
			