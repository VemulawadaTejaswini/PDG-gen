import java.util.*;
import java.io.*;

public class Main{

     public static void main(String []args){
       Scanner scanner = new Scanner(System.in);
       int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<n1;i++)
        {
          list.add(scanner.next());  
        }
       
       Collections.sort(list);
       
        for(int i=0;i<list.size();i++)
        System.out.print(list.get(i));
       
     }
}