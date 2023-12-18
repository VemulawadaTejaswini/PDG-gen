import java.util.*;
class Main{
    int n,a,b;
    boolean[] N;
    void run(){
	Scanner sc =new Scanner(System.in);
	while(true){
	    n=sc.nextInt();
	    a=sc.nextInt();
	    b=sc.nextInt();
	    if((n|a|b)==0)break;
	    N=new boolean[n+1];
	    N[0]=true;
	    setNum();
	    int ans=0;
	    for(int i=1;i<=n;i++){
		if(!N[i])ans++;
	    }
	    System.out.println(ans);
	}
    }
    void setNum(){
	for(int i=0;i<=n;i++){
	    if(N[i]==true){
		if(i+a<=n)N[i+a]=true;
		if(i+b<=n)N[i+b]=true;
	    }
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}