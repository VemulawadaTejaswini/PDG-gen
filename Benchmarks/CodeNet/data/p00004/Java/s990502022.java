import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,x,y;
	while(sc.hasNext()){
	    a=sc.nextInt();	   
	    b=sc.nextInt();
	    c=sc.nextInt();
	    d=sc.nextInt();
	    e=sc.nextInt();
	    f=sc.nextInt();
	    x=(c*e-b*f)/(a*e-d*b);
	    y= (c-a*x)/b;
	    System.out.println(x+".000"+" "+y+".000");
	}
    }
}