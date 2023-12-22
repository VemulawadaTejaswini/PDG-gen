import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int c=sc.nextInt();
		int r=sc.nextInt();
		if(l==1&&c==1&&r==0)System.out.println("Open");
		else if(l==0&&c==0&&r==1)System.out.println("Open");
		else System.out.println("Close");
	}
}