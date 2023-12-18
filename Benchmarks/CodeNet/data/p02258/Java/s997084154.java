import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		
		List<Integer> data=new ArrayList<>();
		
		for(int i=0;i<n;i++)data.add(cin.nextInt());
		
		int min=1000000000,mini=0;
		
		for(int i=0;i<n-1;i++) {
			if(data.get(i)<min) {
				min=data.get(i);mini=i;
			}
		}
		
		int max=0;
		
		for(int i=mini+1;i<n;i++) {
			max=Math.max(data.get(i), max);
		}
		
		System.out.println(max-min);
	}

}

