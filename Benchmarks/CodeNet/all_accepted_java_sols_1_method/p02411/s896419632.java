import java.util.Scanner;
public class Main{
	public static void main(String[] arags){
		Scanner scan = new Scanner(System.in);
		while(true){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int check = m+f;

			if(m==-1&&f==-1&&r==-1){
				break;
			}

			if(m==-1||f==-1){
				System.out.println("F");
			}else if(check>=80){
				System.out.println("A");
			}else if(check>=65&&check<80){
				System.out.println("B");
			}else if(check>=50&&check<65){
				System.out.println("C");
			}else if(check>=30&&check<50){
				if(r>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else if(check<30){
				System.out.println("F");
			}
		}
	}
}