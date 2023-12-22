import java.util.Scanner;

class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int i = 1;
	int x,y;
		do{
			x = scan.nextInt();
			y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			if(x < y){	
				System.out.println(x + " " + y);			
			}
			else{
				System.out.println(y + " " + x);
			}
			i++;
		}while(true);
	}
}