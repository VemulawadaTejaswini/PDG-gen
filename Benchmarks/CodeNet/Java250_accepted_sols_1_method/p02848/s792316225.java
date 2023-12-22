	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,m,answer,index,i,j;
		float ans;
		String s,s1,a1,t,u;
		
			// 整数の入力
		
		n = sc.nextInt();
		s = sc.next();
		sc.close();
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		t="";
		
		for(index=0;index<s.length();index++) {
			s1=s.substring(index,index+1);
			//System.out.print(s1+":");
			
			LoopA: for(i=0;i<26;i++) {
				if(s1.equals(alpha.substring(i,i+1))){
					//System.out.print("*"+i+"*");
					j=(i+n)%26;
					//t.concat(alpha.substring(j,j+1));
					System.out.print(alpha.substring(j,j+1));
					break LoopA;
				}
			}
		}
			// 出力
 
	}
}	