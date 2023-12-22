import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = sc.nextInt();
		if(sum%1000!=0){
			System.out.println("-1 -1 -1");
			return;
		}
		//五千円
		for (int i=0; i<=num; i++) {
			//一万円	
			for (int j=0; j<=num; j++) {
				if(i+j>num) continue;
				int tmp = i*5000 + j*10000;
				if(tmp>sum) continue;
				if(sum==tmp && i+j==num){
					System.out.println(Integer.toString(j)+" "+Integer.toString(i)+" 0");
					return;					
				}
				if((sum-tmp) % 1000 == 0 && (num-i-j)*1000+tmp==sum){
					System.out.println(Integer.toString(j)+" "+Integer.toString(i)+" "+Integer.toString(num-i-j));
					return;
				}
			}			
		}
		System.out.println("-1 -1 -1");

	}

}