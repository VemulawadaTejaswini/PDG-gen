import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		boolean flag = false;
		for(int i=1; i*(i+1)<=2*n; i++){
			if(i*(i+1)==2*n){
				num = i;
				flag = true;
				break;
			}
		}
		if(flag==false){
			System.out.println("No");
		}
		else{
			int[][] s = new int[num+1][num+1];
			for(int i=0; i<=num; i++){
				s[i][0] = num;
			}
			int[] cnt = new int[num+1];
			for(int i=0; i<num; i++){
				for(int j=0; j<=i; j++){
					s[j][++cnt[j]] = i*(i+1)/2 + 1 + j;
					s[i+1][++cnt[i+1]] = i*(i+1)/2 + 1 + j;
				}
			}
			System.out.println("Yes");
			System.out.println(num + 1);
			for(int i=0; i<num+1; i++){
				for(int j=0; j<num+1; j++){
					System.out.print(s[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
}