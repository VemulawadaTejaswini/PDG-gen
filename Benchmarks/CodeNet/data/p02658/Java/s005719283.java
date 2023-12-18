    import java.util.*;
    public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int numLen = sc.nextInt();
        long quo = sc.nextLong();
        for(int i = 0; i < numLen; i++){
          quo *= sc.nextLong();
        }
        if(quo < 1000000000000000000)
        	quo = -1;
        
        System.out.println(quo);
      
      }
    }