import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    String S = scan.next();
	    for(int i=0; i<S.length(); i++){
            int tmp = S.charAt(i)+N;
            if(tmp > 90){
                tmp = S.charAt(i) - 26 + N ;
            }

            System.out.print((char)tmp);
        }
	}

}