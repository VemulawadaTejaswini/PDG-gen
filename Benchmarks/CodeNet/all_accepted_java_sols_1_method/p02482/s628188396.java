import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	int a = n.nextInt();
	int b = n.nextInt();

	if(a < b) System.out.println("a < b");
	else if(a > b) System.out.println("a > b");
	else System.out.println("a == b");
    }
}