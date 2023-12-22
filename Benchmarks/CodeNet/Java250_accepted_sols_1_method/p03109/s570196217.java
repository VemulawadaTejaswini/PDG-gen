import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dateArray = date.split("/",0);
        if(Integer.parseInt(dateArray[0]) < 2019){
            System.out.println("Heisei");
        } else if(Integer.parseInt(dateArray[0]) == 2019 && Integer.parseInt(dateArray[1]) <= 4){
            System.out.println("Heisei");
        } else{
            System.out.println("TBD");
        }
    }
}
