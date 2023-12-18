import java.util.*;
class Main{
 
    public static void main(String[] args)
          {
	Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      
      
	  int sum=0;
        for(int i=1;i<=n;i++){
          int count=0;
         for (int j=1; j<=Math.sqrt(i); j++) 
        { 
            if (i%j==0) 
            { 
                // If divisors are equal, print only one 
                if (i/j == j) {
                    count++; 

                }
       
                else // Otherwise print both 
                {
                    count++;
                    count++;

                }

            }
        } 
          
          sum+=(count*i);
        }
      
      System.out.println(sum);
    }
}

 