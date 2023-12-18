

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
       List<Mgawa> list = new ArrayList<>();
       int x,y;
       
       while((x = sc.nextInt()) != 0 && (y =sc.nextInt()) != 0) list.add(new Mgawa(x,y));    
      
       for(Mgawa m : list){
           m.pie();
           System.out.println();
       }
      
       
    }
    
    
}

class Mgawa{
    int x,y;
    Mgawa(int x, int y){
        this.x = x;
        this.y = y;
    }
            

public void pie() {
    
    for(int i=0; i<this.x; i++){
        for(int j=0; j<this.y; j++){
            
        System.out.print("#");
        }
        
        System.out.println();
    }
    
    
}   
        
    
}
       

   


