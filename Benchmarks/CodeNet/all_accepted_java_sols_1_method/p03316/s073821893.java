import java.util.Scanner;

public class Main {

	 public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String Nb1 = scan.next();
		int Nb2 = Integer.valueOf(Nb1);
		int S=0;
		String result="";
		int Nb3=Nb2;
		for(int i=0;i<Nb1.length();i++) {
			S=S+Nb2%10;
			Nb2=Nb2/10;
		}
		int resultnb=Nb3%S;
		if(resultnb==0) {
			result="Yes";
		}else {
			result="No";
		}
		System.out.println(result);
	}

}