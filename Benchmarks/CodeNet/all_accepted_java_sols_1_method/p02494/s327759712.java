import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int y = sc.nextInt();
			if(h==0&&y==0) System.exit(0);
			for(int i=0;i<h;i++){
				for(int j=0;j<y;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}