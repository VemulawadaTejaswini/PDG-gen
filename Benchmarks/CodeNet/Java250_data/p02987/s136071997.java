import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		boolean flg = false;

		for(int i=1;i<4;i++){
			if(S[0].equals(S[i])){
				for(int j=1;j<3;j++){
					for(int k=j+1;k<4;k++){
						if(S[j].equals(S[k])&&!S[k].equals(S[0]))flg=true;
					}
				}
			}
		}

		// 出力
		System.out.println(flg?"Yes":"No");
	}
}