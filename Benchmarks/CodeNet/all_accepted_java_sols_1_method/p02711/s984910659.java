import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		Set<Integer> set = new HashSet<>();
		while(n!=0)
		{
			set.add(n%10);
			n=n/10;
		}
		if(set.contains(7)==true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}