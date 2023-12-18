import java.util.Scanner;
  
Public class twin prime {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int a = 0,i,j,b=0,k=0;
       
        int[] data= new int [10001];
        char ku=' ';
        
   
        for(i=2;i<=10000;i++){
        	if(data[i]==0){
        		for(j=2;i*j<=10000;j++){
        			data[i*j]=1;
        		}
        	}
        }
      
        
        			
        		
          
          while(b!=1){
        	  a=0;
        	  a += sc.nextInt();
          if(a==0){
        	  break;
          }
          
       for(i=a;i>=3;i--){
    	   if(data[i]==0&&data[i-2]==0){
    		   System.out.println(+i-2+" "+i+"\n");
    		   break;
    	   }
       }
   }
          
       
       
          
    }
}