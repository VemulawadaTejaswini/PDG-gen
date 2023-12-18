import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int max = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			int now = max;
			boolean out = true;
			for(int i=0;i<n;i++){
				now = now + a[i] - b[i];
				if(now<0){
					out = false;
					break;
				}
				if(max<now)max=now;
			}
			if(out==true){
				System.out.println(max);
			}else{
				System.out.println("0");
			}
		}
	}
}