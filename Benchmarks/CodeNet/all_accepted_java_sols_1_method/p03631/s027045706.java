import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer i=sc.nextInt();
		String k=i.toString();
		String l=new StringBuffer(i.toString()).reverse().toString();
		//System.out.println(l+".."+k);
		if(l.compareTo(k)==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
