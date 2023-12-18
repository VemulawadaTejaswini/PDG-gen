import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int space, cnt;
		char str[][] = new char[n + 1][];
		for(int i = 0; i <= n ; i++){
			str[i] = sc.next().toCharArray();
		}
		for(int i = 1; i <= n; i++){
			out:for(int j = 0; j < str[i].length; j++){
				if(str[i][j] == str[0][0]){
					//System.out.println(i + " found " + str[i][j]);
					for(int k = j + 1; j < str[i].length; k++){
						if(str[i][k] == str[0][1] && 2 * k - j < str[i].length){
							//System.out.println(i + " found " + str[i][k]);
							space = k - j;
							//System.out.println(i + " space " +space);
							cnt = 2;
							for(int l = k + space; l < str[i].length; l += space){
								if(str[i][l] == str[0][cnt]){
									//System.out.println(i + " found " + str[i][l]);
									cnt++;
									//System.out.println(i + " cnt "+cnt);
									if(cnt == str[0].length){
										sum++;
										//System.out.println("?????? " + i + " ?????????????????????");
										break out;
									}
								}
								else if(l > str[i].length) break;
							}
						}
						else if(str[i][k] == str[0][1]) break;
					}
				}else if(j >= str[i].length) break;
			}
		}
		System.out.println(sum);
	}
}