import java.util.*;

class Main{

    int INF=1<<28;
    int n;
    int[] a;
    int r;
    double b,v,e,f;
    double[][] dp;

    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    n=sc.nextInt();if(n==0)break;
	    a=new int[n+1];
	    a[0]=0;
	    for(int i=1;i<=n;i++)a[i]=sc.nextInt();
	    b=sc.nextDouble();
	    r=sc.nextInt();v=sc.nextDouble();e=sc.nextDouble();f=sc.nextDouble();

	    dp=new double[n+1][n];
	    for(int i=0;i<dp.length;i++)for(int j=0;j<dp[0].length;j++)dp[i][j]=INF;
	    for(int i=0;i<n;i++)dp[0][i]=0;


	    //dp[i][j]=テ・ツ可催・ツ崢榲」ツδ?」ツつァテ」ツδε」ツつッテ」ツδ敕」ツつ、テ」ツδウテ」ツδ?テ」ツ?ァテ」ツつソテ」ツつ、テ」ツδ、テ」ツつ津・ツ、ツ嘉」ツ?暗」ツ?淌」ツ?ィテ」ツ?催」ツ?ョテ」ツ??」ツつケテ」ツつソテ」ツδシテ」ツδ暗」ツ?凝」ツつ嘉」ツδ?」ツつァテ」ツδε」ツつッテ」ツδ敕」ツつ、テ」ツδウテ」ツδ?テ」ツ?セテ」ツ?ァテ」ツ?ョテヲツ慊?・ツーツ湘ヲツ卍づゥツ鳴?
	    for(int i=0;i<n;i++){ //テァツ渉セテ・ツ慊ィテ」ツ?ョテ」ツδ?」ツつァテ」ツδε」ツつッテ」ツδ敕」ツつ、テ」ツδウテ」ツδ?
		for(int j=0;j<i;j++){//テ」ツδ?」ツつァテ」ツδε」ツつッテ」ツδ敕」ツつ、テ」ツδウテ」ツδ?テ」ツ?ァテ」ツつソテ」ツつ、テ」ツδ、テ」ツつ津・ツ、ツ嘉」ツ?暗」ツつ?
		    double time=0;
		    int dx=a[i+1]-a[i];
		    int x=a[i]-a[j];//テ・ツ可催・ツ崢榲」ツつソテ」ツつ、テ」ツδ、テ」ツつ津」ツ?凝」ツ?暗」ツ?ヲテ」ツ?凝」ツつ嘉」ツ?ョティツキツ敕ゥツ崢「
		    int k;
		    
		    for(k=0;k<dx && x<r;k++){
			time+=1/(v-e*(x-r));
			x++;
		    }
		    for(;k<dx;k++){
			time+=1/(v-f*(r-x));
			x++;
		    }
		    dp[i+1][j]=Math.min(dp[i+1][j],dp[i][j]+time);
		    
		    
		    //テ」ツつソテ」ツつ、テ」ツδ、テ」ツつ津・ツ、ツ嘉」ツ?暗」ツつ凝・ツ?エテ・ツ青?
		     x=0;
		    time=0;
		    for(k=0;k<dx && x<r;k++){
			time+=1/(v-e*(x-r));
			x++;
		    }
		    for(;k<dx;k++){
			time+=1/(v-f*(r-x));
			x++;
		    }
		    dp[i+1][i]=Math.min(dp[i+1][i],dp[i][j]+time+b);
		    
		}
	    }

	    double ans=INF;
	    for(int i=0;i<n;i++)ans=Math.min(ans,dp[n][i]);

	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().run();
    }
}

		  