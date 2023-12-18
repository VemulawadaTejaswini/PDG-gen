import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<a;i++){
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int e=sc.nextInt();
	    int x=b*d+c*e;
	    int y=12000;
	    int z=(b*5+c*2)*8/10;
	    if(d>=5&&e>=2)y=(b*d+c*e)*8/10;
	    if(x>y&&z>y){
	        System.out.println(y);
	    }else{
		if(x>z){
		    System.out.println(z);
		}else{
		    System.out.println(x);
		}
	    }
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}