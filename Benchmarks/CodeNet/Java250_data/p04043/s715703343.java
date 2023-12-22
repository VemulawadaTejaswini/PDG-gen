import java.util.*;

public class Main{
    
    /////////////////////////////////
    //                             //
    //  @ Author: Ali Mohammed Ali //
    //                             //
    /////////////////////////////////
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A,B,C;
        int sum5 = 0;
        int sum7 = 0;
        
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        
        if (A == 5)
            sum5++;
        else if (A == 7)
            sum7++;
        
        if (B == 5)
            sum5++;
        else if (B == 7)
            sum7++;
        
        if (C == 5)
            sum5++;
        else if (C == 7)
            sum7++;
        
        if (sum5 == 2 && sum7 == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
  
    } // End of Main method
    
  } // End of class