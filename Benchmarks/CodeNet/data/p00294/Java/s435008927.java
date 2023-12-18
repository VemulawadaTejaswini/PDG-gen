import java.util.*;
class Main{
    int min(int a,int b){
	if(a<b)return a;
	else return b;
    }
    int max(int a,int b){
	if(a>b)return a;
	else return b;
    }
    Main(){
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int[] N=new int[a];
	boolean [] flg = new boolean [a];

	for(int i=0;i<b;i++){
	   N[i] =sc.nextInt();
	   N[i]-=c;
	   if(N[i]<0) N[i]+=a;
	   flg[ N[i] ] = true;	   
	}
	flg[0] = true;

	int [] n = new int [a];
	int x=0;

	for(int i=0;i<a;i++){
	    if(flg[i]){
		n[x]=i;
		x++;
	    }
	}

	int ans=a;
	for(int i=0;i<x;i++){
	    int L=n[i],R=n[(i+1)%x];
	    int distL= L;
	    int distR= a-R;
	    if(distR==a)distR=0;
	    ans=min(ans,  min(distL,distR)*2+max(distL,distR)  );
	    
	    
	}
	System.out.println(ans*100);


    }
    public static void main (String[]arg){
	new Main();
    }
}