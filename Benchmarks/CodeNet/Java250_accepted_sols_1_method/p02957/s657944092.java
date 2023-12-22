import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        int k;
        if((a + b) % 2 == 1)    System.out.println("IMPOSSIBLE");
        else{
            k = (a + b) / 2;
            System.out.println(k);
        }
    }
}