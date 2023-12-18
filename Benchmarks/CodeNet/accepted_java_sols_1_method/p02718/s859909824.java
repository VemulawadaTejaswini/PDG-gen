import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array=new ArrayList<>();
 
		//商品の種類数
		int N=sc.nextInt();
		//人気商品の数
		int M=sc.nextInt();
		int sum=0;
		int count=0;
 
		for(int i=0;i<N;i++) {
			array.add(sc.nextInt());
			sum+=array.get(i);
		}
		
		//4*M
		BigDecimal a=BigDecimal.valueOf(1);
		BigDecimal b=BigDecimal.valueOf(4*M);
		BigDecimal result=a.divide(b,4,RoundingMode.HALF_UP);
		
		
		BigDecimal sumBigDecimal=BigDecimal.valueOf(sum);
		BigDecimal get=result.multiply(sumBigDecimal);
		
		
		int get1=get.intValue();

		
		for(int entity:array) {
			if(entity>get1){
				count++;
			}
		
 
		}
 
		if(count>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
 
}