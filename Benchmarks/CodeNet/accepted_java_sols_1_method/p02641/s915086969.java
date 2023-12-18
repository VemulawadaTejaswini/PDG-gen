import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int x = scan.nextInt();
		int n = scan.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++)
			set.add(scan.nextInt());
		scan.close();
		
		int min = 101;
		for(int i = 0; i < 101; i++) 
			if(!set.contains(i))
				if(Math.abs(x-i) < Math.abs(x-min)) {
					min = i;
				}else if(Math.abs(x-i) == Math.abs(x-min) && i < min) {
					min = i;
				}
				
		System.out.println(min);
	}

}
