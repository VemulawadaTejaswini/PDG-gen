import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());
		int h[]=new int[100];
		int sum=0;
		int j;

		for(int i=0;i<n;i++){
			h[i]=Integer.parseInt(sc.next());
			for(j=i;j>=0;j--){
				if(i!=0&&h[i]<h[j]){
					break;
				}
			}
			if(j==-1)sum+=1;

		}
		System.out.println(sum);
	}

}