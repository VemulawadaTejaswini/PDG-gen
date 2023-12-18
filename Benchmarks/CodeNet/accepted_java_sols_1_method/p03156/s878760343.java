import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a= sc.nextInt();
		int b= sc.nextInt();
		List<Integer> plist = new ArrayList<>();
		int oneCount =0;
		int twoCount =0;
		int threeCount =0;
		
		for(int i=0;i<n;i++){
			int p = sc.nextInt();
			if(p<=a){
				oneCount++;
			}else if(p<=b){
				twoCount++;
			}else{
				threeCount++;
			}
		}
		System.out.println(Math.min(oneCount,Math.min(threeCount,twoCount)));
	}


}