
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       List<Integer> list = new ArrayList<>();
       
       
       int count = 0;
       
      while(true){
         
          list.add(sc.nextInt());
          
          
          if(count == list.get(0)){
             break;
          }
          
          count++;
          
      }
        int min;
        
        if(list.get(0) != 0){
            min = list.get(1); 
        }else{
            min = 0;
        }
        
        
        int max;
        
        if(list.get(0) != 0){
            max = list.get(1); 
        }else{
            max = 0;
        }
        
        long add = 0;
        
       for(int i=1; i<list.size(); i++){
           if(min > list.get(i)) min = list.get(i);
           if(max < list.get(i)) max = list.get(i);
           add = add + list.get(i);
       }
        
        System.out.println(min +" "+ max +" "+ add);
           
       
    }
}
       

   


