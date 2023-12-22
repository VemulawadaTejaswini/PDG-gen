import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int i = 1;

	while(x > 0){
	    System.out.println("Case "+i+": "+x);

	    x = s.nextInt();
	    i++;
	}
    }
}

