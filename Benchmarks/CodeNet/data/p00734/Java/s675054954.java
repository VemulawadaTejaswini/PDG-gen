import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(true){
		int n,m;
		n=cin.nextInt();
		m=cin.nextInt();
		if(n==0 && m==0){
			break;
		}
		int[] t=new int[n];
		int[] h=new int[m];
		int z,tg=0,hg=0,ta=101,ha=101;
		/*tg=太郎合計　hg=花子合計*/
		for(int s=0;s<n;s++){
			t[s]=cin.nextInt();
		}
		for(int p=0;p<m;p++){
			h[p]=cin.nextInt();
		}
		for(int i=0;i<n;i++){
			z=t[i];
			for(int j=0;j<m;j++){
				t[i]=h[j];
				h[j]=z;
				tg=0;
				hg=0;
				for(int q=0;q<n;q++){
					tg=tg+t[q];
				}
				for(int w=0;w<m;w++){
					hg=hg+h[w];
				}
				if(tg==hg && t[i]+h[j]<ta+ha){
					ta=h[j];
					ha=t[i];
				}
				h[j]=t[i];
				t[i]=z;
			}
		}
		if(ta==101 && ha==101){
			ta=-1;
			ha=-1;
		}
		if(ta<0 && ha<0){
			System.out.println(ta);
		}
		else if(ta>=0 && ha>=0){
			System.out.println(ta+" "+ha);
		}
	}
	}
}