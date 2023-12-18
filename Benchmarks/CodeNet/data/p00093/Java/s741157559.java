import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] uru = new boolean[3001];
		for(int i=0;i<=3000;i++) {
			if(i%4==0   && i%100!=0 || i%400==0)
				uru[i] = true;
			else uru[i] = false;
		}
		int cnt = 0;
		while(true){
            int from = sc.nextInt();
            int to = sc.nextInt();
            if(from +to == 0) break;
 
            if(cnt==0) cnt++;
            else System.out.println();
 
            boolean flg = true;
            for(int i=from;i<=to;i++){
                if(uru[i]){
                    flg = false;
                    System.out.println(i);
                }
            }
 
            if(flg) System.out.println("NA");
        }
	}
}

