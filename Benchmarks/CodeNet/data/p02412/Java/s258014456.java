
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Set> pie = new ArrayList<>();
        int count = 0;
        
        while(true){
          pie.add(new Set (sc.nextInt(),sc.nextInt()));
          
          if(pie.get(count).x == 0 && pie.get(count).y == 0) break;
              
          count++;      
        }
        
        for(int i=0; i < pie.size()-1; i++){
            int root = 0;
            for(int x=1; x<=pie.get(i).x; x++){
              for(int y=1; y<=pie.get(i).x; y++){
                for(int z=1; z<=pie.get(i).x; z++){
                    if(x != y && x != z && y != z){
                        if(x <= pie.get(i).x || y <= pie.get(i).x || z <= pie.get(i).x ){
                            if(x+y+z == pie.get(i).y){
                                //System.out.println((x)+" "+(y)+" "+(z));
                                root ++;
                            }
                        }
                    }
                    
                }
              } 
            }
            
            System.out.println(root / 6);
            //System.out.println(pie.get(0).x);
        }
    }
}

class Set{
    int x = 0;
    int y = 0;
    
    Set(int x, int y){
       this.x = x;
       this.y =y;
    }
}

