import java.util.*;
public class Main{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int temp1 = A+B+C;
        int max = Math.max(A, Math.max(B,C));
        
        if ((temp1 % 2 == 0 && max % 2 == 0) || (temp1 % 2 != 0 && max % 2 != 0) ) {
            System.out.println((3 * max - temp1) / 2);
        } else  {
            int temp2 = (3 * (max+1) - temp1)/2;
            System.out.println(temp2);
        }
        
        
    }

}
