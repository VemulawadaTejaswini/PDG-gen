import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int[] a=new int[21];
			a[0]=cin.nextInt();
			int L=cin.nextInt();
			if(a[0]==0 && L==0){
				break;
			}
			for(int i=0;i<20;i++){
				int[] dc=new int[10];
				int x=a[i];
				for(int n=0;n<10;n++){
					dc[n]=0;
				}
				for(int m=0;m<L;m++){
					dc[x%10]++;
					x=x/10;
				}
				int max=0,min=0;
				for(int l=9;l>=0;l--){
					for(int o=dc[l];o>0;o--){
						max=max*10;
						max+=l;
					}
				}
				for(int p=0;p<=9;p++){
					for(int q=dc[p];q>0;q--){
						min=min*10;
						min+=p;
					}
				}	
			a[i+1]=max-min;
			}
			int ians=0,jans=0;
			for(int w=0;w<=20;w++){
				for(int s=0;s<w;s++){
					if(a[w]==a[s]){
						ians+=w;
						jans+=s;
						w=21;
						s=21;
					}
				}
			}
			System.out.print(jans+" ");
			System.out.print(a[jans]+" ");
			System.out.println(ians-jans);
		}

	}
}