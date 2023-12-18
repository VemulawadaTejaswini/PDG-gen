import java.util.Scanner;

class Main {
	public static void main(String[] args){
	    int count = 0;
	    Scanner s = new Scanner(System.in);
	    while(true){
	        count++;
	        int x = s.nextInt();
	        if(x == 0) break;
	        System.out.println("Case "+ count + ": " + x);
	    }
	}
}