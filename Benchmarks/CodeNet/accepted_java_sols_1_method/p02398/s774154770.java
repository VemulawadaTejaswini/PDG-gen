import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        
      
        int count = 0;
        
         for(int i=0; i<3; i++) list.add(sc.nextInt());
            
         for(int i=list.get(0); i <= list.get(1); i++){
                     
             if(list.get(2) % i == 0) count ++;
             
         }  
          
         System.out.println(count);
       
    }}
       


   

