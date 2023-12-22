import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			int n = s.nextInt();
			int x = s.nextInt();
			int T = 0;
			if(n==0 && x==0) break;
			if(n!=0 && x!=0){
				for(int i=1; i<=n;i++){
					for(int j=i+1;j<=n;j++){
						for(int k=j+1;k<=n;k++){
							if((i+j+k)==x) T++;
						}
					}
				}
			}
			System.out.println(T);
		}
	}
}
