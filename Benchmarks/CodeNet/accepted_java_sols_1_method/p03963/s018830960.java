import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();//球
		int K=sc.nextInt();//颜色
		int ways=K;
		for(int i=0;i<N-1;i++) {
			ways=ways*(K-1);
		}
		System.out.println(ways);
		

	}

}
