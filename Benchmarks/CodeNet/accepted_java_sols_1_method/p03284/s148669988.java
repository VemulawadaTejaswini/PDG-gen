import java.util.*;
class Main{

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	System.out.print((n%k==0)?0:1);
}

}