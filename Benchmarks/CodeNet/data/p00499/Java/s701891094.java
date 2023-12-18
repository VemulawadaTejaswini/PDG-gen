import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();//冬休みの期間
		int A = s.nextInt();//国語のドリルのページ数
		int B = s.nextInt();//算数のドリルのページ数
		int C = s.nextInt();//一日に進められる国語のページ数
		int D = s.nextInt();//一日に進められる算数のページ数
		int asum = 0;
		int bsum = 0;
		int acount = 0;
		int bcount = 0;
		do{//国語が何日で終わるか
			asum += C;
			acount++;
		}while(asum<A);
		do{//算数が何日で終わるか
			bsum += D;
			bcount++;
		}while(bsum<B);
		if(bcount<acount){
			System.out.println(L-acount);
		}else{
			System.out.println(L-bcount);
		}
	}
}