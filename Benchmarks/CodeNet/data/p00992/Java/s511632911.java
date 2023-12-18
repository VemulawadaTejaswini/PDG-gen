import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		long sum = 0;
		int h;
		for(int i=0;i<n;i++){
			h = sc.nextInt();
			if(h-cnt/4>0){
				sum += h-cnt/4;
				cnt++;
			}
		}
		System.out.println(sum+1);
	}	
}