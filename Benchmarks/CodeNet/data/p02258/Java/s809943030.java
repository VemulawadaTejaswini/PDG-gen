import java.util.*;
class Main{
    int max(int a,int b){
	if(a<b)return b;
	else return a;
    }
    int min (int a,int b){
	if(a>b)return b;
	else return a;
    }
    Main(){
	Scanner sc =new Scanner(System.in);
	int a,c,d;
	a=sc.nextInt();
	d=-1000000000;
	c=sc.nextInt();
	for(int i=0;i<a-1;i++){
	    int f=sc.nextInt();
	    d=max(d,f-c);
	    c=min(c,f);
	}
	System.out.println(d);
    }
    public static void main (String[]arg){
	new Main();
    }
}