import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int nA = sc.nextInt();
        int nB = sc.nextInt();
//        double rP = (double) 0.0;
		int  nX = 0;
		

//		rP =  (double) ((double)(nA + nB)/2.0);
		
//		nX = (int) Math.floor(rP);
		if((nA + nB)%2 != 0){
          nX = (nA + nB)/2 +1;
		} else {
          nX = (nA + nB)/2;
		}
		// 出力
		System.out.println(nX);
	}
}