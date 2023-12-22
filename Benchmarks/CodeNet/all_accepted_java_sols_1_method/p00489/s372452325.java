import java.util.*;

class Main{
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
        int a,b,c,d;
    	int n=sc.nextInt();
int tp[]=new int[n];
   for(int i=0;i<(n*(n-1))/2;i++){
	   a=sc.nextInt()-1;b=sc.nextInt()-1;
	   c=sc.nextInt();d=sc.nextInt();
	   if(c>d){
		   tp[a]+=3;
	   }else if(c<d){
		   tp[b]+=3;
	   }else{tp[a]++;
	   tp[b]++;}
	   }
    int flag=1;
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
        	if(tp[i]<tp[j])flag++;
        		}
    	System.out.println(flag);
    	flag=1;
    }
    }
}