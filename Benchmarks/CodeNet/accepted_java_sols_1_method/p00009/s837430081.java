import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,i,j,count=0;
		int a[]=new int[1000000];
		while(s.hasNext()){
			n=s.nextInt();
			for(i=0;i<=n;i++){
				a[i]=i;
			}

			for(i=2;i<=n;i++){
				if(a[i]!=0){
					for(j=2;j*i<=n;j++){
						a[j*i]=0;
					}
				}
			}

			for(i=2;i<=n;i++){
				if(a[i]!=0){
					count++;
				}
			}
			System.out.println(count);
			count=0;
		}//has while

	}
}