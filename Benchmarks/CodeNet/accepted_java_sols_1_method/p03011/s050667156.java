import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int c=sc.nextInt();
		
    
 	if((a+b)<=(b+c)&&(a+b)<=(c+a)){
    		System.out.println(a+b);
    	}else if((b+c)<=(c+a)&&(b+c)<=(a+b)){
     		System.out.println(b+c);
   	 }else{

    	System.out.println(c+a);
    }
    }
}