import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	if (N%1000 != 0) System.out.print(1000-N%1000);
	else {System.out.print(0);}
    }
}
