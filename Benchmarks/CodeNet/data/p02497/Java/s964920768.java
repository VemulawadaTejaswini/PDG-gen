import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m,f,r;
		Scanner sc = new Scanner(System.in);
		while(true){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if(m==-1&&f==-1&&r==-1){
				break;
			}
			else if(m==-1||f==-1){
				System.out.println("F");
			}
			else if(m+f<30){
				System.out.println("F");
			}
			else if(m+f<50){
				if(r>=50){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else if(m+f<65){
				System.out.println("C");
			}
			else if(m+f<80){
				System.out.println("B");
			}
			else{
				System.out.println("A");
			}
		}
	}

}