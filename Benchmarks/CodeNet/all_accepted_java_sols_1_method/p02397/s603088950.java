import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);

    	while(true){
    		int x = scan.nextInt();
    		int y = scan.nextInt();

    		if(x == 0 && y == 0) break;

    		if(x > y){
    			int buf = y;
    			y = x;
    			x = buf;
    		}

    		System.out.println(x + " " + y);
    	}
    }
}