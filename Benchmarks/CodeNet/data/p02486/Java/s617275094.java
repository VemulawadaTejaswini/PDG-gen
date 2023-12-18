import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, x, count;
		
		while(true){
			count = 0;
			n = in.nextInt();
			x = in.nextInt();
			if(n == 0 && x == 0) break;
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					for(int m=1;m<=n;m++){
						if(i==j || j==m || m==i) continue;
						if(i+j+m==x) count++;
					}
				}
			}
			
			System.out.println(count/6);
		}
	}

}