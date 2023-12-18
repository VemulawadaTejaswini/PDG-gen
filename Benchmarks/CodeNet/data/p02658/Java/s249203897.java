import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long res = 1;
		for(int i = 0; i < n; i++){
			long tmp = sc.nextLong();
			if(tmp > 0){
				res *= tmp;
			}else{
				res = 0;
				i += n;
			}
		}
		if(res / 1000000000000000000L >= 1){
			res = -1;
		}
		System.out.println(res);
	}
}
