import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] word = line.split("");
        if(word[2].equals(word[3]) && word[4].equals(word[5])) {
            System.out.println("Yes");   
        }else {
            System.out.println("No");
        }
    }
}