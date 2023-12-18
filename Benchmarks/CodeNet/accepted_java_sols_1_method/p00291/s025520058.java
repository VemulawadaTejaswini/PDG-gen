import  java.util.*;
class Main{
    int c1;
    int c5;
    int c10;
    int c50;
    int c100;
    int c500;
    int sum;
    Main(){
	Scanner sc=new Scanner(System.in);
	c1=sc.nextInt();
	c5=sc.nextInt();
	c10=sc.nextInt();
	c50=sc.nextInt();
	c100=sc.nextInt();
	c500=sc.nextInt();
		
	c1=1*c1;
	c5=5*c5;
	c10=10*c10;
	c50=50*c50;
	c100=100*c100;
	c500=500*c500;
	sum=c1+c5+c10+c50+c100+c500;

	if(sum>=1000){
	    System.out.println("1");
        }else{
	    System.out.println("0");
	}
    }




    public static void main(String[] args){
	new Main();
    }
}