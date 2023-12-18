public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int K = sc.nextInt();
		 String S = sc.next();

		 //大文字を小文字に変換
		 S = S.toLowerCase();
		 if(1<=K && K<=100) {

			 if(1<=S.length() && S.length()<=100) {

				 if(S.length() >= K) {

					 System.out.println(S.substring(0,K)+ "...");
				 }
				 else if(S.length() <= K) {

					 System.out.println(S);
				 }

			 }
		 }

	}
}