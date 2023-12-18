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

    int calc(int b,int c,int d,int e){
	int res=b*d+c*e;
	if(d>=5&&e>=2)res=res*8/10;
	return res;
    }

    Main(){
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<a;i++){
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int e=sc.nextInt();

	    int D=max(d,5);
	    int E=max(e,2);

	    int x=min( calc(b,c,d,e) , calc(b,c,D,E) );
	    System.out.println(x);
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}