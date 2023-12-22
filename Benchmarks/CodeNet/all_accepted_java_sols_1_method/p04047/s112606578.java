import java.util.*;
import java.io.*;


public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<2*n;i++)
        list.add(scanner.nextInt());
        
        Collections.sort(list);
        int sum=0;
        for(int i=0;i<2*n;i=i+2)
        sum+=list.get(i);
        
      
        System.out.println(sum);
        //for(int i=0;i<n;i++);
        //int n = scanner.nextInt();
        //String n = scanner.next();
        //System.out.println("");
     }
}