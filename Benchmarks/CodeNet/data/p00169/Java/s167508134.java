import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String[] s = sc.nextLine().split(" ");
			if(s[0].compareTo("0")==0) break;
			int n = s.length;
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = Integer.valueOf(s[i]);
			
			boolean flag = false;
			int sum = 0;
			for(int i=0;i<n;i++){
				if(a[i]>10) sum+=10;
				else sum+=a[i];
				if(a[i]==1) flag = true;
			}
			if(flag==true && sum+10<=21) sum+=10;
			
			if(sum>21) System.out.println(0);
			else System.out.println(sum);
		}	
	}	
}