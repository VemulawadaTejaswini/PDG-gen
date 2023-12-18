import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
                
        
       for(int i=0; i<2; i++){
           
            int x = sc.nextInt();
           
            list.add(x);
           
       }
       
       
       
      
            
            System.out.printf(list.get(0)/list.get(1) +" "+ list.get(0)%list.get(1) +" ");
            System.out.println(String.format("%.5f",(double)list.get(0)/list.get(1) ));
           
        
        
    }}
       
     

