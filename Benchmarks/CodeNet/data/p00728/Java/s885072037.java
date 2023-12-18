import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1147().doIt();
	}
	class aoj1147{
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int num[] = new int [n];
				int max = 0;
				int min = Integer.MAX_VALUE;
				int ave = 0;
				for(int i = 0;i < n;i++){
					num[i] = sc.nextInt();
					if(num[i] > max)max = num[i];
					if(num[i] < min)min = num[i];
				}
				for(int i = 0;i < n;i++){
					if(num[i] == max){
						max = Integer.MAX_VALUE;
					}else if(num[i] == min){
						min = Integer.MAX_VALUE;
					}else{
						ave = ave + num[i];
					}
				}
				ave = ave / (n - 2);
				System.out.println(ave);
			}
		}
	}
}