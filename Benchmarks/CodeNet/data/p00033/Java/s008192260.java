import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j,n,k;
		int a[]=new int[10];
		int x[]=new int[10];
		int y[]=new int[10];
		n=s.nextInt();
		while(n--!=0){
			for(i=0;i<10;i++){
				a[i]=s.nextInt();
			}
			
			j=0;k=0;i=0;
			
			//ツつ「ツつッツづゥツづつアツづ慊づ陛青堕、ツづ可妥」ツ禿シ
			x[0]=a[0];
			i++;
			while(true){
				if((a[i]-x[j])<0) break;
				if(i>=9) break;
				j++;i++;
				x[j]=a[i];
			}
			
			if(i<10)
			y[k]=a[i++];
	
			//ツ振ツづィツ閉ェツつッ
			for(;i<10;i++){
				if(a[i]-x[j]<0 && a[i]-y[k]<0){
					System.out.println("NO");
					break;
				}
				
				if(a[i]-y[k]<0){
					if(x[j]-a[i]>y[k]-a[i]){
						k++;
						y[k]=a[i];
					}
				}

				if(a[i]-x[j]<0){
					if(x[j]-a[i]<y[k]-a[i]){
						j++;
						x[j]=a[i];
					}
				}
			}//for
			if(i==10)
			System.out.println("YES");
		}//while
	}
}