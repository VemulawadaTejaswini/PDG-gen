import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		while(n!=0 || x!=0){
			cnt = 0;
			for(int i = 1; i<n-1;i++){
				for(int j=i+1; j<n; j++){
					for(int k =j+1; k<n+1; k++){
						if(x == i + j + k){
							cnt+=1;
						}
					}
				}
			}
			System.out.println(cnt);
			n = sc.nextInt();
			x = sc.nextInt();
		}
	}
}