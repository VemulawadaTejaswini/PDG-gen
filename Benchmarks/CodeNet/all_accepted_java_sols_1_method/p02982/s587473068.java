	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapX = new HashMap<Integer,Integer> ();
		int x[][];
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,d,index,index2,j;
			int sum,result,xd,r;
			double rd;;
			
			n = sc.nextInt();
			d = sc.nextInt();
			x=new int[10][10];
			for(index=0;index<n;index++) {
				for(index2=0;index2<d;index2++) {
					x[index][index2]=sc.nextInt();
				}
			}
			sc.close();
			result=0;
			for(index=0;index<n-1;index++) {
				for(index2=index+1;index2<n;index2++) {
					sum=0;
					for(j=0;j<d;j++) {
						xd=(x[index][j]-x[index2][j]);
						sum+=xd*xd;
					}
					rd=Math.sqrt(sum);
					r=(int)rd;
					if(r*r==sum) {
						result=result+1;
					}
				}
			}
			System.out.println(result);

			
 
			// 出力
 
	}
}