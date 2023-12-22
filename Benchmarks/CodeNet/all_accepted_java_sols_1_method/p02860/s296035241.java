import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		//Sを左右半分ずつ切り出す		
		String S1 = S.substring(0,N/2);
		String S2 = S.substring(S.length()-N/2);
      
	  //Nが奇数の場合除外
      //左半分と右半分が等しければYes
      //そうでなければNo
      if(N%2!=0){
        System.out.println("No");
      }else if(S1.equals(S2)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
    }
	}
}