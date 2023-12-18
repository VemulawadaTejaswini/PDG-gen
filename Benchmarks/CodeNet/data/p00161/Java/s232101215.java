import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int []c1=new int[n];
			int []m1=new int[n];
			int []s1=new int[n];
			int []m2=new int[n];
			int []s2=new int[n];
			int []m3=new int[n];
			int []s3=new int[n];
			int []m4=new int[n];
			int []s4=new int[n];
			int []t=new int[n];
			for(int i=0;i<n;i++){
				c1[i]=sc.nextInt();
				m1[i]=sc.nextInt();
				s1[i]=sc.nextInt();
				m2[i]=sc.nextInt();
				s2[i]=sc.nextInt();
				m3[i]=sc.nextInt();
				s3[i]=sc.nextInt();
				m4[i]=sc.nextInt();
				s4[i]=sc.nextInt();
				t[i]=s1[i]+s2[i]+s3[i]+s4[i]+(m1[i]+m2[i]+m3[i]+m4[i])*60;
			}
			int n1=c1[0],n2=c1[0],bb=c1[0];
			int n1t=t[0],n2t=t[0],bbt=t[0],wt=t[0];
			for(int i=1;i<n;i++){
				if(t[i]<n1t){
					if(n1t<n2t){
						n2t=n1t;
						n2=n1;
						if(wt==bbt&&n2t<bbt){
							bbt=n2t;
							bb=n2;
						}
					}
					n1=c1[i];
					n1t=t[i];
				}else if(n2t>t[i]&&t[i]>n1t){
					if(wt==bbt&&n2t<bbt){
						bbt=n2t;
						bb=n2;
					}
					n2=c1[i];
					n2t=t[i];
				}else if(wt>t[i]&&t[i]>bbt){
					bb=c1[i];
					bbt=t[i];
				}else wt=t[i];
			}
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(bb);
		}
	}
}