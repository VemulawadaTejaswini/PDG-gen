import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int x = Integer.valueOf(sc.next());
            int y = Integer.valueOf(sc.next());
            int z = Integer.valueOf(sc.next());

            System.out.println(z + " " + x + " " + y);            
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}