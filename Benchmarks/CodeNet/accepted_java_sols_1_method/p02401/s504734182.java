import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	char[] op = s.next().toCharArray();
	int b = s.nextInt();

	while(op[0] != 63){
	    if(op[0] == 43) System.out.println(a+b);
	    else if(op[0] == 45) System.out.println(a-b);
	    else if(op[0] == 42) System.out.println(a*b);
	    else if(op[0] == 47) System.out.println(a/b);

	    a = s.nextInt();
	    op = s.next().toCharArray();
	    b = s.nextInt();
	}
    }
}

