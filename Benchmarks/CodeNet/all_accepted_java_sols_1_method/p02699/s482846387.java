import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int s = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());

            if(w >= s) System.out.println("unsafe");
            else System.out.println("safe");

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}