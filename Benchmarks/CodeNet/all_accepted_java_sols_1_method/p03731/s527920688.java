
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		long total = 0;
		int t = sc.nextInt();
		int tmp=0;
		int tmp2;
		for(int i = 1;i<N;i++){
			tmp2=sc.nextInt();
			if(T>tmp2-tmp){
				total += tmp2-tmp;
			}
			else{
				total +=T;
			}
			tmp=tmp2;
		}
		if(N==1){
			total=T;
		}
		else{
			total +=T;
		}

		System.out.println(total);
	}


}
