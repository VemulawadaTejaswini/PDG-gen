import java.util.*;
public class Main {
	public static void main(String[] args) {
		int c =0;
		
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n==0 && x ==0)break;
			
			for(int i = 1; i <= n;i++){
				for(int k = i+1; k<=n;k++){
					for(int o = k+1; o<=n; o++){
						if(i + k + o == x){
							c++;
						}
					}
				}
			}
		}
		System.out.println(c);

	}

}