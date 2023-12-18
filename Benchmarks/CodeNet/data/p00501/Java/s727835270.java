import java.util.*;

public class signboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		String tar = sc.next();
		for(int i=0;i<n;i++){
			String s = sc.next();
			if(search(tar,s)){
				ans++;
			}
		}
		System.out.println(ans);
	}

	static boolean search(String tar , String str){
		int keylen=tar.length();
		int len=str.length();
		int s=0;
		boolean cntflg=true;

		//現在検索している文字
		for(int j=0;j<=len-keylen;j++){
			//ターゲットの先頭文字と一致する文字をstrから探す
			if(tar.charAt(0)==str.charAt(j)){
				//System.out.println("first;"+j);
				//空白をあけて文字列を検索
				for(int leap=1;leap<=(len-j-1)/(keylen-1);leap++){
					s=1;
					cntflg=true;
					int h=j;
					for(s=1;s<keylen;s++){
						h+=leap;
						if(tar.charAt(s)==str.charAt(h)){
							s++;
						}else{
							cntflg=false;
							break;
						}
					}
					//ずっとフラグがtrueのままだったなら文字列が存在する
					if(cntflg)return true;
				}
			}
		}
		return false;
	}
}