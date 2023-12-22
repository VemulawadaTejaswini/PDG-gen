import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String [] Num =s.split("");
		int az = 0;
		int za = 0;
		int n = Num.length;
		if(Num.length % 2 == 0) {
			for(int i = 0; i < n; i += 2) {
				if(Num[i].equals("0")) {
					az ++;
				}
				if(Num[i+1].equals("1")) {
					az ++;
				}
				if(Num[i].equals("1")) {
					za ++;
				}
				if(Num[i+1].equals("0")) {
					za ++;
				}
			}
		}else {
			for(int i = 0; i < n-1; i += 2) {
					if(Num[i].equals("0")) {
						az ++;
					}
					if(Num[i+1].equals("1")) {
						az ++;
					}
					if(Num[i].equals("1")) {
						za ++;
					}
					if(Num[i+1].equals("0")) {
						za ++;
					}
				}
				if(Num[n-1].equals("0")) {
					az ++;
				}
				if(Num[n-1].equals("1")) {
					za ++;
				}
			}
		int ans = Math.min(az, za);
		System.out.println(ans);
		sc.close();
	}
	
}

