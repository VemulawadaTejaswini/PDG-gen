import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int count = 0;

    	while(true){
    		count++;
    		int x = scan.nextInt();

    		if(x == 0){
    			break;
    		}

    		System.out.println("Case " + count + ": " + x);
    	}
    }
}