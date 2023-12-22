import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int b[]=new int[m];
		int a[][]=new int[n][m];
		int count=0;
		int total=0;

		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			for(int s=0;s<m;s++){
				a[i][s]=sc.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			total=0;
			for(int s=0;s<m;s++){
				total+=a[i][s]*b[s];
			}
			if(total+c>0){
				count++;
			}
		}

		System.out.println(count);

	}
}
