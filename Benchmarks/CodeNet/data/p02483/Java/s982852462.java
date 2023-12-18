import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=c-b;
	int e=b-a;
	int f=a-c;

	if(d>0 || d==0){
	    if(e>0 || e==0){
	        System.out.println(a +" "+ b +" "+ c);
	    }else if(f>0 || f==0){
		System.out.println(b +" "+ c +" "+ a);
	    }else if(f<0){
		System.out.println(b +" "+ a +" "+ c);
	    }
	}

        if(d<0){
	    if(f<0){
		System.out.println(a +" "+ c +" "+ b);
	    }else if(e>0 || e==0){
		System.out.println(c +" "+ a +" "+ b);
	    }else if(e<0){
		System.out.println(c +" "+ b +" "+ a);
	    }
	}		
	

    }
}