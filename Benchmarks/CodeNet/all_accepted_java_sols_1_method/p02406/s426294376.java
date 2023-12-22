import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numValue = sc.nextInt();
        for(int i = 3; i <= numValue; i++){
            if(i % 3 == 0 || String.valueOf(i).contains("3")){
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}


