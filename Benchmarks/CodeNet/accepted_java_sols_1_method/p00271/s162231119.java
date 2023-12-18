import  java.util.*;
class Main{
    int a;
    int b;
    
    Main(){
	Scanner sc=new Scanner(System.in);
	for(int i=1; i<8; i++){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println(a-b);
	}

    }

    public static void main(String[] args){
	new Main();
    }
}