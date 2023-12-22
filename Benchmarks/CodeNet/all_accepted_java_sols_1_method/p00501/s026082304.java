import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char a[][] = new char[n + 1][];
		int sum = 0, d = 0, cnt = 0;
		for(int i = 0;i <= n;i++){
			a[i] = sc.next().toCharArray();
		}
		for(int i = 1;i <= n;i++){
out1:		for(int j = 0;j < a[i].length;j++){
				if(a[0][0] == a[i][j]){
					for(int k = j + 1;k < a[i].length;k++){
						if(a[0][1] == a[i][k]){
							d = k - j;
							cnt = 2;
out2:						for(int l = k + d;l < a[i].length;l += d){
								if(a[0][cnt] == a[i][l]) cnt++;
								else break out2;
								if(cnt == a[0].length){
									sum++;
									break out1;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}