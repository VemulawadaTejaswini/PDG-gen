import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
out:		while(x!=0 || y!=0){
			if(x==0 && y==0){
				break out ;
			}
			if(y>x){
				System.out.println(x+" "+y);
			}else{
				System.out.println(y+" "+x);
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
}