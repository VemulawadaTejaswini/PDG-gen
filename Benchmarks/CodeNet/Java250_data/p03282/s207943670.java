import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		long k = sc.nextLong();
		if(ss.charAt(0) != '1'){
			System.out.println(ss.charAt(0));
			return;
		}else{
			for(int i = 0;i < k;i++){
				if(ss.charAt(i) != '1'){
					System.out.println(ss.charAt(i));
					return;
				}
			}
			System.out.println(1);
			
			
		}
		
	
	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

