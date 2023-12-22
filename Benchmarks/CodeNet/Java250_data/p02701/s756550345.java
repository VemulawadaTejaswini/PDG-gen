

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String string=scanner.nextLine();
        HashSet set=new HashSet();
        for (int i = 0; i <n ; i++) {
           string=scanner.nextLine();
            set.add(string);
        }
        System.out.println(set.size());
    }
}
