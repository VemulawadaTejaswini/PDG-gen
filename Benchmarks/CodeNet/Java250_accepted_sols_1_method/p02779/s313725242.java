import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		Set <Integer>set=new TreeSet<Integer>();
		
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			set.add(num);
		}
		
		if(n==set.size())System.out.println("YES");
		else System.out.println("NO");
	}
}