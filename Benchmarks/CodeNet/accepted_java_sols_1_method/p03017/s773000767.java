import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String st = in.readLine();
		String S = in.readLine();


		String[] stSplit = st.split(" ");
		int N = Integer.parseInt(stSplit[0]);
		int A = Integer.parseInt(stSplit[1])-1;
		int B = Integer.parseInt(stSplit[2])-1;
		int C = Integer.parseInt(stSplit[3])-1;
		int D = Integer.parseInt(stSplit[4])-1;

		char[] sChar = S.toCharArray();

		boolean nothreeSpace = true;
		boolean wRock = false;
		int bigger = C;
		int i=B-1;
		if(D < C){
			while(i<sChar.length-2 && i < D){
				if(sChar[i+2]=='#'){
					i+=3;
				}else if(sChar[i+1]=='#'){
					i+=2;
				}else if(sChar[i]=='#'){
					i+=1;
				}else{
					//最初に見つかった...の中にDが存在する場合、#D..または..D#の場合はAがBを追い越せない
//					if(i==D && sChar[D-1]=='#'){
//						break;
//					}else if(i+2==D && sChar[D+1]=='#'){
//						break;
//					}
					nothreeSpace = false;
					break;
				}
			}
			bigger = C;
		}else{
			bigger = D;
		}

		i=A;
		while(i < bigger && i < sChar.length -1 ){
			if(sChar[i+1] == '#'){
				if(sChar[i] == '#'){
					wRock = true;
					break;
				}else{
					i+=1;
				}
			}else{
				i+=2;
			}
		}

		String ans = "Yes";
		if(wRock == true){
			ans = "No";
		}else{
			if(D < C){
				if(nothreeSpace == true){
					ans = "No";
				}
			}
		}

		System.out.println(ans);
	}
}