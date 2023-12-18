import java.util.*;

public class Main {

    public static void main(String[] args) {

    	ArrayList<Integer> ar = new ArrayList<Integer>();
    	
        //input
         Scanner sc = new Scanner(System.in);

         int n,cnt;
         boolean isPrime;
         while(sc.hasNext()){
         cnt = 0;
    		 n = sc.nextInt();
    		 for(int i=2;i<=n;i++){
    			 isPrime = true;
    			 for(int j=2;Math.pow(j,2)<=i;j++){
    				 if(i%j==0){
    					 isPrime = false;
    					 break;
    				 }
    			 }
    			 if(isPrime){cnt++;}
    		 }
    		 ar.add(cnt);
         }

         //output
         for (int i:ar) {System.out.println(i);}
    }
}