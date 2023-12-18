import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	int x,y;
	while(true){
	    x = in.nextInt();
	    y = in.nextInt();
	    if(x ==0 && y ==0)break;
	    if(x <= y)System.out.println(x + " " + y);
	    if(x > y)System.out.println(y + " " + x);
	    
	}
    }
}
	    

