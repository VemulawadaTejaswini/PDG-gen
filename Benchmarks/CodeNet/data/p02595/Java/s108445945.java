import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextLong();
		int count =0;


//配列にしないと、最後の値だけ反映されるとかそんな感じになる？
		for(int i=0; i<N; i++){
		long X =sc.nextLong();
		long Y=sc.nextLong();
		

			if(X*X+Y*Y<=D*D){
			count++;
			}
		}

		System.out.println(count);				

	}//main

}//Distance
