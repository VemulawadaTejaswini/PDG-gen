import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int c = 4;
		int d = 7;
		int flag = 0;
		int cut = 0;
		for(int i=0;i<=25;i++){
			for(int j=0;j<=14;j++){
				cut = c*i + d*j;
				if(cut == 0)cut = 4;
				if(n%cut==0){flag=1;break;}
				if(cut>100){break;}
			}
			if(flag==1)break;
		}
		// 文字列の入力
		//String s = sc.next();
		// 出力
		if(flag==1)System.out.println("Yes");
		else System.out.println("No");
	}
}