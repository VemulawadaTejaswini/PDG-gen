/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mountain;

/**
 *
 * @author cse
 */
import java.util.Scanner;
public class Mountain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int n,c,d,swap;
       Scanner in=new Scanner (System.in);
      System.out.println("Height of mountain " );
        n=in.nextInt();
        int array[]=new int[n];
       System.out.println("Enter "+ n +" height");
        for (c=0;c<n;c++)
            array[c]=in.nextInt();
            for(c=0;c<(n-1);c++)
            {
                for(d=0;d<n-c-1;d++)
                {
                    if (array[d+1]>array[d])
                            {
                                swap=array[d+1];
                                array[d+1]=array[d];
                                array[d]=swap;
                            }
                }
    }
            System.out.println("higest mountain");
            for (c=0;c<3;c++)
                System.out.println(array[c]);
        }
}