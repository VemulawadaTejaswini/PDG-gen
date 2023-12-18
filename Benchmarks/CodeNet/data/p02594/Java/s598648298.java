import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int money = Integer.parseInt(line);
      
      if (money < 30){
            System.out.println("No");
        } else {
            System.out.println("Yes");
    }
    }
}