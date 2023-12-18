import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			switch(a){
			case 1:
				System.out.println(b*6000);
				break;
			case 2:
				System.out.println(b*4000);
				break;
			case 3:
				System.out.println(b*3000);
				break;
			case 4:
				System.out.println(b*2000);
				break;
			}
		}
	}

}