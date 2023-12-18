import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		String[] s = sc.next().split("");
		int[] chofukuInfofirst = new int[10];
		int[] chofukuInfosecond = new int[10];
		int[] chofukuInfothird = new int[10];
		for(int i =0;i < n-2;i++) {
			if(chofukuInfofirst[Integer.parseInt(s[i])] ==0) {
				chofukuInfofirst[Integer.parseInt(s[i])]++;
				chofukuInfosecond = new int[10];
			}else {
				continue;
			}

			for(int j =i +1;j < n-1;j++) {

				if(chofukuInfosecond[Integer.parseInt(s[j])] ==0) {
					chofukuInfosecond[Integer.parseInt(s[j])]++;
					chofukuInfothird = new int[10];
				}else {
					continue;
				}
				for(int k =j +1;k < n;k++) {
					if(chofukuInfothird[Integer.parseInt(s[k])] ==0) {
						chofukuInfothird[Integer.parseInt(s[k])]++;
						answer++;
					}else {
						continue;
					}

				}
			}
		}
		System.out.println(answer);
	}
}