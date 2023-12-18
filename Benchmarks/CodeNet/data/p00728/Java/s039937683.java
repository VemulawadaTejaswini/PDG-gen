import java.util.*;

public class Main {

	public static void main(String[] args){
		int min,max,sum;
		Scanner r = new Scanner(System.in);
		while(true){
			sum=0;
			int n = r.nextInt();
			if(n==0) break;
			max = r.nextInt();
			int s = r.nextInt();
			if(s>max){
				min=max;
				max=s;
			}else min=s;
			for(int i=2;i<n;i++){
				s = r.nextInt();
				if(s>=max) {
					sum +=max; max=s;
				}
				else if(s<=min){
					sum +=min; min=s;
				}
				else sum +=s;

			}
			System.out.println(sum/(n-2));

		}
	}

}