import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int y=Integer.parseInt(scan.next());

		int j;
		for(int i=0;i <= n;++i){//　千円札
			for(int k = 0;k <= n-i;++k){//　五千円札
				j=n-k-i;

				if((1000*i+5000*k+10000*j)==y){
					System.out.print(j+" "+k+" "+i);
					System.exit(0);
				}
			}
		}
		System.out.print("-1 -1 -1");

	}
}
//end
