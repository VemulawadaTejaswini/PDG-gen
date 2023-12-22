import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ret = Integer.parseInt(line);
        ret = ret == 0 ? 1 : 0;
        
        System.out.println(ret);
    }
}