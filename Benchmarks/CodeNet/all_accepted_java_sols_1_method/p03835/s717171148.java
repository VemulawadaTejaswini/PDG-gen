import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), s = sc.nextInt();
		int z, cnt = 0, i, j;
		for(i = 0; i <= k; i++){
			for(j = 0; j <= k; j++){
				z = s-(i+j);
				if(0 <= z && z <= k) cnt++;
			}
		}
		System.out.println(cnt);
	}
}