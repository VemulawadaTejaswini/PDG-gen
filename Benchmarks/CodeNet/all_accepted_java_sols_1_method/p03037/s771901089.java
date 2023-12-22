import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=Integer.parseInt(scan.next());
        int m=Integer.parseInt(scan.next());

        ArrayList<Integer> L=new ArrayList<Integer>();
        ArrayList<Integer> R=new ArrayList<Integer>();

        for(int i=0;i<m;i++){
            L.add(scan.nextInt());
            R.add(scan.nextInt());
        }

        Integer i=Collections.max(L);
        Integer j=Collections.min(R);

        System.out.print((i<=j) ? j-i+1 : 0);
     
    }
}