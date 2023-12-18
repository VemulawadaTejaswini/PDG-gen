import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		boolean flg = true;
		int max = 32;

		for(int x=0;x<N;x++){
			int num = sc.nextInt();
			int count = 0;
			while(count<max&&num%2!=1){
				num /= 2;
                                count++;
			}
			if(count<max)max=count;
		}

		System.out.println(max);
	}
}