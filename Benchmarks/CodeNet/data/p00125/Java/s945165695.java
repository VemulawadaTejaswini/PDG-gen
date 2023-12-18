import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] a = new int[6];
			for(int i=0;i<6;i++) a[i] = sc.nextInt();
			if(a[0]==-1 && a[1]==-1 && a[2]==-1 && a[3]==-1 && a[4]==-1 && a[5]==-1) break;
			
			int[] sum = new int[2];
			
			for(int c=0;c<2;c++){
				for(int i=1;i<a[3*c];i++){
					if(i%400==0 || (i%4==0 && i%100!=0)) sum[c]+=366;
					else sum[c]+=365;
				}
				for(int i=1;i<a[1+3*c];i++){
					if(i==2){
						if(a[3*c]%400==0 || (a[3*c]%4==0 && a[3*c]%100!=0)) sum[c]+=29;
						else sum[c]+=28;
					}else if(i==4 || i==6 || i==9 || i==11){
						sum[c]+=30;
					}else{
						sum[c]+=31;
					}
				}
				sum[c]+=a[2+3*c];
			}
			System.out.println(sum[1]-sum[0]);
		}
	}	
}