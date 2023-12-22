import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split("");
        boolean ans = true;
        for(int i = 0; i < line1.length; i++){
            if(i % 2 == 0 && line1[i].equals("L"))  ans = false;
            if(i % 2 == 1 && line1[i].equals("R"))  ans = false;
        }
        if(ans) System.out.println("Yes");
        else    System.out.println("No");
    }
}