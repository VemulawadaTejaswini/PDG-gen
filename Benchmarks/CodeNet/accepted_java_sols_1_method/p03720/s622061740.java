import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m*2];
		for(int i=0; i<m*2; i++){
			c[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<n; i++){
          	count = 0;
			for(int j=0; j<m*2; j++){
				if(c[j]==i+1)count++;
			}
		System.out.println(count);
		}
	}
}