import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner imput = new Scanner(System.in);
		int n = 0;
		while(n == 0){
			int m = imput.nextInt();
			int f = imput.nextInt();
			int r = imput.nextInt();
			
			if(m == -1 && f == -1 && r == -1){
				break;
			}else if(m <-1||m > 50||f < -1||f > 50||r < -1||r >100){
				System.out.println("score is fault");
				break;
			}

			if(m == -1||f == -1||m+f <30){
				System.out.println("F");
			}else if(30 <= m+f && m+f < 50){
				if(r < 50){
					System.out.println("D");
				}else{
					System.out.println("C");
				}
			}else if(50 <= m+f && m+f < 65){
				System.out.println("C");
			}else if(65 <= m+f && m+f < 80){
				System.out.println("B");
			}else{
				System.out.println("A");
			}
		}
	}
}