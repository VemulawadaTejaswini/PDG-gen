import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		String T ="";
		String[] A = {"dream","dreamer","erase","eraser"};
		String[] B = {"eam","mer","ase","ser"};
		int i = S.length();
		String sfx="";
		String ans = "YES";
		boolean flg=true;
		while(flg){
			sfx=S.substring(i-3,i);
			for(int x=0;x<B.length;x++){
				if(sfx.equals(B[x])){
					if(A[x].equals(S.substring(i-A[x].length(),i))){
						i=i-A[x].length();
						sfx=null;
						break;
					}else{
						ans="NO";
						flg=false;
						break;
					}
				}
			}
			if(sfx!=null){
				ans="NO";
				break;
			}
			if(i==0){
				break;
			}
			if(i-3<0){
				ans="NO";
				break;
			}
		}

		System.out.println(ans);
	}
}
