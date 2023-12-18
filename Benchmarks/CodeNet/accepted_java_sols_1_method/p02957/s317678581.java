import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=(a+b)/2;
    
 	if(a%2!=b%2){
    		System.out.println("IMPOSSIBLE");
    	}else{

    	System.out.println(ans);
    }
    }
}
