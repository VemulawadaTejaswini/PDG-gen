import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[8];
		int b[]=new int[4];
		for(int i=0;i<4;i++){
			int se =stdIn.nextInt();
			int mai=stdIn.nextInt();
			switch(se){
			case 1:
				a[i]=mai*6000;
			break;
			case 2:
				a[i]=mai*4000;
			break;
			case 3:
				a[i]=mai*3000;
			break;
			case 4:
				a[i]=mai*2000;
			break;
			}
		}for(int i=0;i<4;i++){
			System.out.println(a[i]);
		}
	}
}