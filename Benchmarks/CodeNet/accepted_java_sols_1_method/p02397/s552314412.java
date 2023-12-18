import java.util.Scanner;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		while(true){	    
			int x = in.nextInt();	
			int y = in.nextInt();
			if ((x == 0 && y ==0)) {
				break;
			}
			else if (x<y){
				System.out.println(x+" "+y);
			}
			else if (x>=y){
				System.out.println(y+" "+x);
			}
		}	
	}
}