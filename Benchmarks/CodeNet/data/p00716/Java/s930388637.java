import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		for(int z=0;z<m;z++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int max = 0;
			for(int i=0;i<n;i++){
				int t = sc.nextInt();
				double r = sc.nextDouble();
				int c = sc.nextInt();
				int temp;
				int sum;
				if(t==1){
					temp = a;
					for(int j=0;j<b;j++){
						temp = (int)(temp*(1+r))-c;
					}
				}else{
					temp = a;
					sum = 0;
					for(int j=0;j<b;j++){
						sum += temp*r;
						temp -= c;
					}
					temp += sum;
				}
				max = Math.max(max, temp);
			}
			System.out.println(max);
		}
	}	
}