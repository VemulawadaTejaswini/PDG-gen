import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] page = new int[n];
			for(int i = 0;i < n;i++){
				page[i] = scan.nextInt();
			}
			Arrays.sort(page);
			int[] dif = new int[n-1];
			for(int i = 0;i < n-1;i++){
				dif[i] = page[i+1] - page[i];
			}
			String ans = String.valueOf(page[0]);
			boolean fl = true;
			boolean sw = false;
			for(int i = 0;i < n-1;i++){
				sw = true;
				if(fl && dif[i] == 1){
					ans += "-";
					fl = false;
				}else if(dif[i] > 1 && !fl){
					ans += page[i] + " " + page[i+1];
					fl = true;
					sw = false;
				}else if(dif[i] > 1){
					ans += " " + page[i+1];
					sw = false;
				}
			}
			if(sw){
				ans += page[n-1];
			}
			System.out.println(ans);
		}
	}
}