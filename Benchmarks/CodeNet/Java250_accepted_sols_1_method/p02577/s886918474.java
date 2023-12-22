import java.util.*;
public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n =sc.nextLine();
		n.trim();
		int sum=0;
		char line[] = n.toCharArray();
		for(int c : line)
			sum+=c-'0';
		System.out.println(sum%9==0?"Yes":"No");
	}

}
