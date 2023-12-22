import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();//文字取得ラーメンの具材
		String b[] = a.split("");//具材の有無を入れる配列
		int total = 700;
		
		for(int c = 0;c < 3;c++){
			if(b[c].equals("o")){
				total = total + 100;
			}
		}
		System.out.println(total);
	}
}
