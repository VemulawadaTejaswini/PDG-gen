import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.sqrt(Integer.parseInt(sc.nextLine().replaceAll(" ", "")))%1==0?"Yes":"No");
    }
}