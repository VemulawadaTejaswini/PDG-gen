import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int i = n;
        while(i > 0){
            String line = sc.nextLine();
            System.out.println(line.replace("Hoshino", "Hoshina"));
            i--;
        }
    }
}

