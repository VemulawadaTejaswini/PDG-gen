import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] len_list = new int[3];
		int[] triangles = new int[3];
		while (true) {
			for (int i = 0; i < 3; i++){
				int len = sc.nextInt();
				len_list[i] = len;
			}
			Arrays.sort(len_list);
			// 3辺の長さ
			int l1 = len_list[0];
			int l2 = len_list[1];
			int l3 = len_list[2];
			// 存在しない場合出力
			if (l1 + l2 <= l3) {
				int t1 = triangles[0];
				int t2 = triangles[1];
				int t3 = triangles[2];
				System.out.println(t1+t2+t3+" "+t2+" "+t1+" "+t3);
				break;
			}
			int s1 = l1 * l1 + l2 * l2;
			int s2 = l3 * l3;
			if (s1 > s2) {
				triangles[0]++;
			} else {
				if (s1 == s2) {
					triangles[1]++;
				} else {
					triangles[2]++;
				}
			}

		}
	}
}

