import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		
		List<Integer> data=new ArrayList<>();
		
		for(int i=0;i<n;i++)data.add(cin.nextInt());
		
		int res=-2000000000,minv=data.get(0);
		
		for(int i=1;i<n;i++) {
			res=Math.max(res, data.get(i)-minv);
			minv=Math.min(minv, data.get(i));
		}
		System.out.println(res);
	}

}

