import java.util.*;
class Main{    Main(){
	Scanner sc =new Scanner(System.in);
	while(true){
	    int a=sc.nextInt();
	    int b;
	    int c=0;
	    int d=1;
	    int m=100000;
	    boolean x=true;
	    if(a==0)break;
	    for(int i=0;i<a;i++){
		b=sc.nextInt();
		if(b>=2){
		    x=false;
		    c++;
		}
		if(b>0)d++;
	    }  
	    if(x){
		System.out.println("NA");
	    }else if(c==1){
		System.out.println(2);
	    }else{
		System.out.println(d);
	    }
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}