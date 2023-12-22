import java.util.*;

class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){

            //int ans = Integer.valueOf(sc.next());
            String input = sc.next();
            String input1 = input.substring(0, 1);
            String input2 = input.substring(1, 2);
            String input3 = input.substring(2, 3);

            if(input1.equals(input2) && input1.equals(input3)){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }


        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}