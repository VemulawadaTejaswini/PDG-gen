
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static final int INF=9999999;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		
		List<Integer> money = new ArrayList<>();
		money.add(1);
		{
			int x=6;
			while(x<=100000){
				money.add(x);
				x*=6;
			}
			x=9;
			while(x<=100000){
				money.add(x);
				x*=9;
			}
			Collections.sort(money);
		}

		int[] a=new int[100001];
		Arrays.fill(a, INF);
		
		int step=0;
		List<Integer> stepList = new ArrayList<>();
		List<Integer> nextStepList = new ArrayList<>();
		stepList.add(0);
		
		while(a[N]==INF){
			for(int x:stepList){
				for(int m:money){
					if(x+m>N) break;
					if(a[x+m]>step+1){
						a[x+m]=step+1;
						nextStepList.add(x+m);
					}
				}
			}
			step++;
			stepList=new ArrayList<>(nextStepList);
			nextStepList.clear();
		}
		
		System.out.println(a[N]);
		
	}
}
