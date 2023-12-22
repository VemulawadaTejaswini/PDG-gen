import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
  		
		int ans=0;
		
  		for(int b=x;b>=0;b--){
        if((4*b+2*(x-b))==y){
        ans=1;
          break;
        }
        }
       
 	if(ans==1){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}