import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s;
			int max = 0;
			int min = 1000;
			int ave = 0;
			if(n==0) break;
			for(int i = 0;i < n;i++){
				s = sc.nextInt();
				ave += s;
				if(s < min) min = s;
				if(s > max) max = s;
			}
			ave -= min + max;
			System.out.println(ave/(n-2));
		}
	}
}