import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l[] = new int[2*n];
		for(int i=0; i<2*n; i++){
			l[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i=0; i<2*n; i++){
			int largest = 0;
			int flag = 0;
			for(int j=0; j<2*n; j++){
				if(l[j]>largest){
					largest = l[j];
					flag = j;
				}
			}
			if(i%2==1){
				ans = ans + largest;
			}
			l[flag] = 0;
		}
		System.out.println(ans);
	}
}