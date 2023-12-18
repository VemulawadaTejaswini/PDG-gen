import java.util.*;
class main{
	Scanner sc=new Scanner(System.in);
	void a(){
		boolean notprime[]=new boolean[104730];
		int ans[]=new int[10000];
		int count=1;
		ans[0]=2;
		notprime[0]=notprime[1]=true;
		for(int i=3;i<104730;i+=2){
			if(!notprime[i]){
				ans[count++]=i;
				for(int j=i+i;j<104730;j+=i)notprime[j]=true;
			}
		}
                  int a=0;
                  while(true){
                           int g=sc.nextInt();
                           if(g==0)break;
		         for(int i=0;i<g;i++)a+=ans[i];
                           System.out.println(a);
		}
	}
	public static void main(String[]arg){
		new main().a();
	}
}