import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]data = new int[100001];
		int repeat = 0;
		int res = N;
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			data[input]++;
		}
		for(int i = 0 ; i<data.length ; i++){
			if(data[i]>=2)repeat+=data[i]-1;
		}
		if(repeat%2 == 0){
		//	System.out.println("TEST");
			res-=repeat;
		}
		else {
			res-=repeat+1;
		//	System.out.println(repeat);
		//	System.out.println("Test");
		}
		System.out.println(res);
	}
}
