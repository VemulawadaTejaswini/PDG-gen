import java.util.Scanner;
  
public class sample {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int a = 0,i,j,b=0;
        int[] data= new int [10001];
        /*for(i=2;i<=10000;i++){
        	data[i]=0;
        }*/
        for(i=2;i<=10000;i++){
        	if(data[i]==0){
        		for(j=2;i*j<=10000;j++){
        			data[i*j]=1;
        		}
        	}
        }
        
        			
        		
          
          while(b!=1){
        	  a += sc.nextInt();
          if(a==0)break;
       for(i=a;i>=2;i--){
    	   if(data[i]==0&&data[i-2]==0){
    		   System.out.println( +data[i-2]);System.out.println(+data[i]);
    		   
    		   break;
    	   }
       }
          }
          
       
       
          
    }
}

        