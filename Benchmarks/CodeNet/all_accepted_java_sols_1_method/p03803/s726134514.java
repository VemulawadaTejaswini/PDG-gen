
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int alice = sc.nextInt(), bob = sc.nextInt();
	if(alice == 1 && bob != 1)
	    System.out.println("Alice");
	else if(bob  == 1 && alice != 1)
	    System.out.println("Bob");
	else if(alice < bob)
	    System.out.println("Bob");
	else if(alice > bob)
	    System.out.println("Alice");
	else
	    System.out.println("Draw");
    }

}
