import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[4];
		int b[]=new int[4];
		for(int c=0;c<n;c++){
			for(int j=0;j<4;j++)
				a[j]=sc.nextInt();
			for(int j=0;j<4;j++)
				b[j]=sc.nextInt();	
		
				int ans=0,ians=0,jans=0,kans=0;
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						if(i==0&&j==1||i==1&&j==0||i==2&&j==3){
							ians+=a[i]*b[j];
							//System.out.println(ians);
						}else if(i==0&&j==2||i==2&&j==0||i==3&&j==1){
							jans+=a[i]*b[j];
							//System.out.println(jans);
						}else if(i==0&&j==3||i==3&&j==0||i==1&&j==2){
							kans+=a[i]*b[j];
							//System.out.println(kans);
						}else if(i==0&&j==0){
							ans += a[i]*b[j];//1/1
							//System.out.println(ans);
						}else if(i==3&&j==2){
							ians+=-a[i]*b[j];//-i k/j
							//System.out.println(ians);
						}else if(i==1&&j==3){
							jans+=-a[i]*b[j];//-j i/k
							//System.out.println(jans);
						}else if(i==2&&j==1){
							kans+=-a[i]*b[j];//-k j/i
							//System.out.println(kans);
						}else{
							ans+=-a[i]*b[j];//-1 ii jj kk
							//System.out.println(ans);
						}
					}									
				}
				System.out.println(ans+" "+ians+" "+jans+" "+kans);
		}
	}
}


//ans += s[i][j]*s[i+1][j];//1/1
//ans+=s[i][j]*s[i][j];//*i  1/i i/1 j/k  
//ans+=s[i][j]*s[i][j];//*j 1/j j/1 k/i 
//ans+=s[i][j]*s[i][j];//*k 1/k k/1 i/j
//ans+=-s[i][j]*s[i][j];//-1 ii jj kk
//ans+=-s[i][j]*s[i][j];//-i k/j
//ans+=-s[i][j]*s[i][j];//-j i/k
//ans+=-s[i][j]*s[i][j];//-k j/i