import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();

	while(x != 0 || y != 0){
	    if(x <= y) System.out.println(x+" "+y);
	    else System.out.println(y+" "+x);

	    x = s.nextInt();
	    y = s.nextInt();
	}
    }
}

