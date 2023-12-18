import  java.util.*;
class Main{
    int t;
    int n;
    
    Main(){
	Scanner sc=new Scanner(System.in);
	for(int i=1; i<5; i++){
	    t=sc.nextInt();
	    n=sc.nextInt();
	    if(t==1){
		System.out.println(6000*n);
	    }else if(t==2){
		System.out.println(4000*n);
	    }else if(t==3){
		System.out.println(3000*n);
	    }else if(t==4){
		System.out.println(2000*n);
	    }
			   
	}

    }

    public static void main(String[] args){
	new Main();
    }
}