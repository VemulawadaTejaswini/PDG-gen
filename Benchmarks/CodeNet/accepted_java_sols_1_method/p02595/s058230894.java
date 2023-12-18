import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		Long D2 = (long) Math.pow(D, 2);
		Integer cnt = 0;
		  
		for(int i=0; i<N; i++){
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			Long tmpD = (long) Math.pow(tmp1, 2);
			tmpD += (long) Math.pow(tmp2, 2);
			if(tmpD <= D2){
				cnt++;
			}
		}

        System.out.println(cnt);
		return;
	}
}
