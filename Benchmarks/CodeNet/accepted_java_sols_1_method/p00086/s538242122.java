import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int[] c = new int[101];
			
			while(true){
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a==0 && b==0) break;
				c[a]++;
				c[b]++;
			}
			int cnt = 0;
			for(int i=1;i<101;i++){
				if(c[i]%2==1) cnt++;
			}
			
			if(cnt!=2) System.out.println("NG");
			else if(c[1]%2==1 && c[2]%2==1) System.out.println("OK");
			else System.out.println("NG");
		}	
	}	
}