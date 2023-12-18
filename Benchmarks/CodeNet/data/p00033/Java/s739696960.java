
import java.util.Scanner;
								
public class Main{
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			while(n--!=0){
				int[] ball = new int[11];
				for(int i=0;i<10;i++) {
					ball[i] = sc.nextInt();
				}
				
				boolean can = true;
				
				for(int i=0;i<(1<<10);i++) {
					can = true;
					int s1 = 0;
					int s2 = 0;
					for(int j=0;j<10;j++) {
						if((i>>j)%2==0) {
							if(s1<ball[j]) {
								s1 = ball[j];
							}
							else{
								can = false;
							}
							
						}
						else {
							if(s2<ball[j]) {
								s2=ball[j];
							}
							else {
								can = false;
							}
							
						}
						if(can)break;
					}
				}
				
				String ans = "YES";
				if(!can)ans = "NO";
				System.out.println(ans);
			}
	}
}

