import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String S_a=sc.next();	//aのカード
		String S_b=sc.next();	//bのカード
		String S_c=sc.next();	//cのカード

		char winner='A';	//勝者(初期設定をAとする)

		int card_a=S_a.length();	//aのカード枚数
		int card_b=S_b.length();	//bのカード枚数
		int card_c=S_c.length();	//cのカード枚数

		int i_a=0,i_b=0,i_c=0;	//ターン
		int next=0;

		if(S_a.charAt(i_a)=='a'){
			card_a--; next=1; i_a++;
		}else if(S_a.charAt(i_a)=='b'){
			card_b--; next=2; i_b++;
		} else if(S_a.charAt(i_a)=='c'){
			card_c--; next=3; i_c++;
		}

		while(true){
			//各文字列のi番目の文字に対応する人のカードの数を減らす
			if(next==1) {
				card_a--;
				if(card_a==-1) break;
				next=check(S_a.charAt(i_a));
				i_a++;
			}else if(next==2){
				card_b--;
				if(card_b==-1) break;
				next=check(S_b.charAt(i_b));
				i_b++;
			}else if(next==3){
				card_c--;
				if(card_c==-1) break;
				next=check(S_c.charAt(i_c));
				i_c++;
			}
		}

		if(card_b==-1) winner='B';
		else if(card_c==-1) winner='C'; 

		//結果を出力
		System.out.println(winner);
	}

	public static int check(char check_letter){
		int next=0;
		if(check_letter=='a') next=1;
		else if(check_letter=='b') next=2;
		else if(check_letter=='c') next=3;
		return next;
	}
} 