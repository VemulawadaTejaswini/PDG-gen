import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();

        ArrayList<Integer> W = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            W.add(scan.nextInt());
        }

        int sum=0;
        for(Integer temp:W){
            sum+=temp;
        }

        int sumk=0;
        int min=Math.abs(sum-2*W.get(0));
        int diffk;

        for(int j=0;j<n-1;j++){
            
            sumk=0;
            for(int k=0;k<=j;k++){
                sumk+=W.get(k);
            }

            diffk=Math.abs(sum-2*sumk);

            if( diffk < min) min=diffk;

        }
        System.out.print(min);
        
  



    }
}