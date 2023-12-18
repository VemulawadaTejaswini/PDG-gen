import java.util.Scanner;
class Main{
	public static void main(String[] args){
	int i = 0;
		while(i<1000){
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
			
		}
	}
}