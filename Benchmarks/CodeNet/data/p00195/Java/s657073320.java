import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int tar = 0;
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			int sum = a + b;
			for(int i = 1;i < 5;i++){
				int c = scan.nextInt() + scan.nextInt();
				if(sum < c){
					sum = c;
					tar = i;
				}
			}
			switch(tar){
			case 0:
				System.out.print("A ");
				break;
			case 1:
				System.out.print("B ");
				break;
			case 2:
				System.out.print("C ");
				break;
			case 3:
				System.out.print("D ");
				break;
			case 4:
				System.out.print("E ");
				break;
			default:
				break;
			}
			System.out.println(sum);
		}
	}
}