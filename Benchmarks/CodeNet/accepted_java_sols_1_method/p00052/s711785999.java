import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0)break;
			int sum = 0;
			int count = 0;
			int num = 0;
			for(int i=5;i<=n;i+=5){
				count = 0;
				num = i;
				while(num%5==0){
					num /= 5;
					count++;
				}
				sum += count;
			}
				
			System.out.println(sum);
		}
	
	}	
}