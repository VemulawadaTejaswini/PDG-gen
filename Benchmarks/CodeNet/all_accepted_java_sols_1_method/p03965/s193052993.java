import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		int ans = 0;
		int gnum = 0;
		for(int i = 0;i < string.length();i++){
			if(gnum == 0){
				if(string.charAt(i) == 'p'){			//相手がパー
					ans--;
					gnum++;
				}else{
					gnum++;
				}
			}else{
				if(string.charAt(i) == 'p'){			//相手がパー
					gnum--;
				}else{
					ans++;
					gnum--;
				}
				
			}
		}
		System.out.println(ans);
	}
}