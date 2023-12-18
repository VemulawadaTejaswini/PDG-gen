import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s,count;
		int r[];
		while(true){
			n=sc.nextInt();
			s=sc.nextInt();
			if(n+s==0) break;
			count=0;
			r=new int[n];
			for(int i=0;i<n;i++){
				r[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(r[i]+r[j]>s){
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}