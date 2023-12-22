import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            String n = sc.next();

            if(n.substring(0, 1).equals("7") ||
                n.substring(1, 2).equals("7") ||
                n.substring(2, 3).equals("7")){

                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}