import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String topping[] = line.split("");
        int price = 700;
        for(int i = 0; i<3; i++){
            if(topping[i].equals("o")){
                price += 100;
            }
        }
        System.out.println(price);
    }
}
