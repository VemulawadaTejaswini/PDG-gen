import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int z= 0;
		for(int a=1;a>0;a++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x==0 && y==0){
				break;
			}
			if(x>y){
				z = x;
				x = y;
				y = z;
			}
			if(x<=y){
				System.out.println(x +" "+ y);
			}
		}
	}
}