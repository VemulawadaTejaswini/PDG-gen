import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		//入力したそのままの数
		String s=sc.next();
		
		//逆にした文字列
		StringBuffer str=new StringBuffer(s);
        String s2=str.reverse().toString();
		
		int count=0;
		int roopcount = 0;
		
		if(s.length()%2==0) {
			roopcount =s.length()/2;
		}else {
			roopcount=(s.length()-1)/2;
		}
		
		for(int i=0;i<roopcount;i++) {
			String a = s.substring(i,i+1);
			String b = s2.substring(i,i+1);
						
			if(!a.equals(b)){
				count+=1;
			}
		}
		System.out.println(count);
		sc.close();
	}
}