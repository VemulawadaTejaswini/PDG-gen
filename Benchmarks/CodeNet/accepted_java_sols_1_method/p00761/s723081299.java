import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] a = new int[m];
			list.add(n);
			
			int b, c, d;
			int count = 0;
			while(true){
				count++;
				for(int i=0;i<m;i++){
					a[i] = n%10;
					n /= 10;
				}
				Arrays.sort(a);
				b=0;
				c=0;
				d=1;
				for(int i=0;i<m;i++){
					b += a[m-1-i]*d;
					c += a[i]*d;
					d *= 10;
				}
				n = c-b;
				if(list.indexOf(n)==-1){
					list.add(n);
				}else{
					int ansA = list.indexOf(n);
					System.out.println(ansA + " " + n + " " + (count-ansA));
					break;
				}
				
			}
		}
	
	}	
}