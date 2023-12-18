import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int res = 0;
		for(int i = 0; i < n; i++){
			int pos = sc.nextInt();
			int tmp = 2 * pos;
			int tmp2 = Math.abs(2 * (pos - k));
			if(tmp > tmp2){
				res += tmp2;
			}else{
				res += tmp;
			}
		}
		System.out.println(res);

 	}
}


