import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
		
    
 	if(b==3){
    		System.out.println("bon");
    	}else if(b==0||b==1||b==6||b==8){
     		System.out.println("pon");
   	 }else{

    	System.out.println("hon");
    }
    }
}