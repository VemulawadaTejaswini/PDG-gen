import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String slist[] = s.split("");
        int price = 700;
        for(int i = 0; i < s.length(); i++){
            if(slist[i].equals("o")){
                price += 100;
            }
        }
        System.out.println(price);
    }
}
