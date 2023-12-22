import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String name=sc.next();
		String board;
		int distant,now,count=0;
		
		for(int i=0;i<n;i++){
			board=sc.next();
		out:	for(int j=0;j<board.length();j++){//看板のj文字目を参照
				if(name.charAt(0)==board.charAt(j)){//名前の１文字目と看板のj文字目が一致したとき
					for(int k=j+1;k<board.length();k++){//次の文字と一致する看板の文字を探す
						if(name.charAt(1)==board.charAt(k)){//2文字目が一致したら
							distant=k-j;//j文字目とj+1文字目の距離をとる
							now=2;
							for(int l=k+distant;l<board.length();l=l+distant){//k（j＋１）文字目からdistantだけ離れた位置に
								if(name.charAt(now)==board.charAt(l)){//3文字目があったとき
									if(now==name.length()-1){//nowが最後の文字を参照していたら
										count++;//その看板は条件をクリアしている
										break out;//次の看板の入力に移る
									}
									now++;//k+2...name.length();　distant間隔に目的の文字があったとき次の文字へ移動？
								}
								else break;//distantの距離に次の文字がなければ、看板の次の２文字目を探す
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}