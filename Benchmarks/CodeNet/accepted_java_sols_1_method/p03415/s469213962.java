import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] firstLine = sc.nextLine().split("");
        String[] secondLine = sc.nextLine().split("");
        String[] thirdLine = sc.nextLine().split("");
        
        System.out.println(firstLine[0]+secondLine[1]+thirdLine[2]);
    }
}