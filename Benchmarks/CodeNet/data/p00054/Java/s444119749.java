import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			float w = (float)a/b;
			
			if(a==b){
				System.out.println(0);
			}else{
				int sum = 0;
				for(int i=1;i<=n;i++){
					int m = (int)(w*Math.pow(10,i));
					sum += m%10;
				}
				System.out.println(sum);
			}
		}
	}
}