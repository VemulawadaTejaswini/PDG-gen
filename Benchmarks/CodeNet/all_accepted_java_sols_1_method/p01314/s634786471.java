import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int sum = 0;
			int count = 0;
			for(int i=1;i<n;i++){
				sum = 0;
				for(int j=i;j<n;j++){
					sum += j;
					if(sum==n){
						count++;
						break;
					}else if(sum>n){
						break;
					}
				}
			}
			System.out.println(count);
		}
	}	
}