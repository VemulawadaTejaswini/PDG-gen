import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int member = sc.nextInt();
			int quorum = sc.nextInt();
			if(member==0&&quorum==0) break;
			int[] dates = new int[100];

			for(int i=0; i<member; i++){
				int dates_num = sc.nextInt();
				for(int j=0; j<dates_num; j++){
					int day = sc.nextInt();
					dates[day-1]++;
				}
			}

			int max = 0, maxday = 0;

			for(int i=0; i<100; i++){
				if(max<dates[i]){
					max = dates[i];
					maxday = i+1;
				}
			}

			if(max<quorum){
				System.out.println("0");
			}else{
				System.out.println(maxday);
			}
		}
	}
}