import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while (true){
      int n=scan.nextInt();
      int p =scan.nextInt();
     
      if((n|p)==0)break;
      boolean flag=true;
      int init =p;
      int [] Mayor_stone = new int[n];
      for(int i=0;i<n;i++)Mayor_stone[i]=0;
      while(flag){
      for(int i=0;i<n;i++){
    	  if(p!=0){
    		  p--;
    		  Mayor_stone[i]++;
    		  if(p==0&&Mayor_stone[i]==init){
    			  flag=false;
    			  System.out.println(i);
    			  break;
    		  }
    	  }
    	  else {
    		  p=Mayor_stone[i];
    		  Mayor_stone[i]=0;
    	  }
    	  
      }
      }

    			  
      }
        }
      

}