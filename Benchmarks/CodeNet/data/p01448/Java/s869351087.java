import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			int[] m = new int[100002];
			int a, b;
			for(int i=0;i<n;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				for(int j=a;j<=b;j++) m[j]++;
			}
			
			boolean flag = false;
			for(int i=n;i>0;i--){
				if(m[i]==n){
					System.out.println(i-1);
					flag = true;
					break;
				}
			}
			if(flag==false) System.out.println(0);
		}	
	}	
}