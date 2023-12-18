import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] year = new boolean[7368800];
		int p = m;
		int ans = 0;
		while(n!=0){
			Arrays.fill(year, false);
			for(int i=0; i<n; i++){
				for(int k=p; k<year.length; k+=p){
					year[k] = true;
				}
				do{
					p++;
				}while(year[p]==true);
			}
			for(int i=m; i<year.length; i++){
				if(year[i]==false){
					ans = i;
					break;
				}
			}
			System.out.println(ans);
			m = sc.nextInt();
			n = sc.nextInt();
          	p = m;
		}
	}
}
