import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextInt()) {
				int m = sc.nextInt();
				int min = sc.nextInt();
				int max = sc.nextInt();
				if(m==0 && min==0 && max==0) break;
				
				int [] score = new int[m];
				for(int i=0;i<m;i++)
				{
					score[i] = sc.nextInt();
				}
				
				int d =0;
				int p =0;
				for(int i=max;i>=min;i--) {
					if(score[i-1]-score[i]>d) {
						d=score[i-1]-score[i];
						p=i;
					}
				}
				System.out.println(p);
			}
		}
	}
}


