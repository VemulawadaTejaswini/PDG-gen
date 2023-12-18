import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [] k = new int [n];
	int a = 0;
	int cnt = 0;
	for(int i = 0;i < n;i++) {
		k[i] = sc.nextInt();
	}
out:	for(int i = 0;;i++){
		for(int j = 0;j < n;j++) {
			if(k[j] % 2 == 1) {
				break out;
			}
			k[j] = k[j] / 2;
		}
		cnt ++;
	}
	System.out.println(cnt);
	}
}

