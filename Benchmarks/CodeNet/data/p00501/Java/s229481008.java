import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,l,n = sc.nextInt(),diff,cnt = 0,flag = 0,a=0;
		char[] target = sc.next().toCharArray();
		char[][] old = new char[n][];
		for(i = 0; i < n; i ++ ){
			old[i] = sc.next().toCharArray();
			diff = 0;
			flag = 0;
n1:			for(k = 0; k < old[i].length; k ++ ){
				if(target[0] == old[i][k]){
					flag = 1;
					for(j = 0; j < old[i].length; j ++ ){				
						if(target[target.length-1] == old[i][j]){
							diff = (j - k) / (target.length-1);
							flag = 2;
							for(l = 1; l <= target.length-1; l ++ ){
								if(target[l] == old[i][k + l * diff]){
									flag ++;
									if(flag == target.length){
										cnt ++;
										break n1;
									}
								}
								else break;
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}