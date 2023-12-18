import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		String[] s = S.split("");

		int[] bCnt = new int[N+1];
		bCnt[0] = 0;

		for(int i=1; i<N+1; i++){
			if(s[i-1].equals("#")){
				bCnt[i] = bCnt[i-1]+1;
			} else{
				bCnt[i] = bCnt[i-1];
			}
		}

		int[] wCnt = new int[N+1];
		wCnt[N]=0;

		for(int i=N-1; i>-1; i--){
			if(s[i].equals(".")){
				wCnt[i]= wCnt[i+1]+1;
			}else{
				wCnt[i]= wCnt[i+1];
			}
		}

		int min = 200001;

		for(int i=0; i<N+1; i++){
			if(min>bCnt[i]+wCnt[i]){
				min = bCnt[i]+wCnt[i];
			}
		}

		System.out.println(min);


	}


}
