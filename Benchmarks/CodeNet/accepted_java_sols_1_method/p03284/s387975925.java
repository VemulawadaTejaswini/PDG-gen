import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int crackerN = scanner.nextInt();
        int peopleM = scanner.nextInt();
        int getMin = crackerN/peopleM;
        int exceed = crackerN%peopleM;
        if(exceed >1){
            exceed=1;
        }
        System.out.println(exceed);
    }
}
