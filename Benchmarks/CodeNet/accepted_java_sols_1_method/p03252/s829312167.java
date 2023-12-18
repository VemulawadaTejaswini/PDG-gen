import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 100000000;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		String S = sc.next();
		String T = sc.next();
		
		for(int i = 0;i < S.length();i++){
			
			int[] data = new int[10000000];
			for(int j = i;j < S.length();j++){
				if(S.charAt(i) == S.charAt(j))
				data[j] = 1;
			}
			
			
			
			for(int j = i;j < S.length();j++){
				if(data[j] == 1){
					if(T.charAt(i) != T.charAt(j)){
//						System.out.println("1");
//
						System.out.println("No");
						return;
					}
				}else{
					
					if(T.charAt(i) == T.charAt(j)){
//						System.out.println("i  "+i+" j "+j);
//
						System.out.println("No");
						return;
					}
				}
			}
			
			String del =String.valueOf(S.charAt(i));
			S = S.replace(del, "");
			
			
			
			String dele =String.valueOf(T.charAt(i));
			T = T.replace(dele, "");
			
		


			
			i--;
			
			
		}
		System.out.println("Yes");


	}



}



