import  java.util.*;
class Main{
    int a;
    int b;
    int c;
    Main(){
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
        b=sc.nextInt();
	c=sc.nextInt();

	if( (a==1 && b==1 && c==0) || (a==0 && b==0 && c==1) ){
	    System.out.println("Open");
	}else{
	    System.out.println("Close");
	}
    }

    public static void main(String[] args){
	new Main();
    }
}