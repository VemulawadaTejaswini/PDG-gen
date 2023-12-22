import java.util.Scanner;
import java.util.regex.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;
		String s=sc.next();
		long K=sc.nextLong();
	
		
	
		long aho=5000000000000000L;
		
		int[] nums = new int[s.length()];
		//int[] counts=new int[s.length()];
		int non_one=0;
		//System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++){
			nums[i]=Character.getNumericValue(s.charAt(i));
			//System.out.println(i+":"+nums[i]);
			//counts[i]=nums[i];
			
			if(nums[i]!=1){
				non_one=i;
				break;
			}
			
		}
		if(K<=non_one){
			System.out.println(1);
		}else{
			System.out.println(nums[non_one]);
		}
		
		
		
	}
}