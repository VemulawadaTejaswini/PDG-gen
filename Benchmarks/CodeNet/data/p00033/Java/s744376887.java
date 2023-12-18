import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a,b,c,d;
	String x="YES";
	a=sc.nextInt();

	while(a>0){
	    a--;
	    c=0;d=0;
	    for(int i=0;i<10;i++){
		b=sc.nextInt();
		if(c<b)c=b;
		else if(d<b)d=b;
		else x="NO";
	    }
	    System.out.println(x);
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}