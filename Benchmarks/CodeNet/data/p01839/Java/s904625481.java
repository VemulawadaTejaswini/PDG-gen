
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int N;
		int Acnt=0;
		int Ucnt=0;
		int cnt =0;
		String ans;
		boolean err = true;
		Scanner sc = new Scanner(System.in);
		//N = sc.nextInt()
		N = 4;
		while(N != cnt){
			ans = sc.next();
			if(ans=="A"){
				++Acnt;
				cnt = cnt +1;
			}
			if(ans=="Un"){
				++Ucnt;
				cnt = cnt +1;
			}
			if(Acnt - Ucnt > 0){
				continue;
			}else if(Acnt - Ucnt < 0){
				err = false;
			}
			
		}
		if(err == true && N == cnt){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		if(err == false)System.out.println("errr");
		sc.close();

	}

}