import java.util.*;
class Main {
	public static void main(String[] abcdefg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%1000==0)System.out.print(0);
		else System.out.print(1000-n%1000);
		sc.close();
		   
	}
}

