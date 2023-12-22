import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		//int N = sc.nextInt();
		String string = sc.next();
		int ans =0;
		for(int i= 0;i<4;i++){
			if(string.charAt(i) == '+'){
				ans++;
			}else{
				ans--;
			}
		}
		System.out.println(ans);
	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



