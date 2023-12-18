import java.util.Arrays;
import java.util.Scanner;

/**
 * https://abc053.contest.atcoder.jp/tasks/arc068_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] card = new int[100001];
		for(int i=0; i<N; i++){
			card[sc.nextInt()]++;
		}
		sc.close();
		
		int remove = 0;
		for(int c:card){
			if(c>=2) remove += c-1;
		}
		if(remove%2==1) remove++;
		
		/*
		int num=0;
		int remove=0;
		int l=1;
		int r=100000;
		while(l<=r){
			while(card[l]<2){
				num+=card[l];
				l++;
			}
			while(card[r]<2){
				num+=card[r];
				r--;
			}
			System.out.println("========");
			System.out.println(l+":"+r);
			if(card[l]+card[r]+num+remove==N){
				remove+=(card[l]-1)*2;
				num = num -(card[l]-1);
				card[l]=1;
				l++;
				if(card[r]>=2){
					remove+=(card[r]-1)*2;
					num = num -(card[r]-1);
					card[r]=1;
					r--;
				}
			}else{
				if(card[l]>card[r]){
					remove+=(card[r]-1)*2;
					card[l]=card[l]-card[r]+1;
					num++;
					r--;
				}else{
					remove+=(card[l]-1)*2;
					card[r]=card[r]-card[l]+1;
					num++;
					l++;
				}
			}
			System.out.println(remove);
		}*/
		
		System.out.println(N-remove);

	}

}