import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	//配列
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
      	//カウント用
        int count = 0;
      	//添え字が「小中大」もしくは「大中小」でn[i]が真ん中
      	//（エラーが出たのでforの条件修正）
        for(int i = 1; i < n-1; i++){
        	if((num[i]>num[i-1] && num[i]<num[i+1]) || (num[i]>num[i+1] && num[i]<num[i-1])){
            	count++;
            }
        }
        System.out.println(count);
     }
}