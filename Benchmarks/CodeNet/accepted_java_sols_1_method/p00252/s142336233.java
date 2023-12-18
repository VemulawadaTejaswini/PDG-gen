import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		if((a==1 && b==1) || c==1)System.out.println("Open");
		else System.out.println("Close");
	}

}

