import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine(). toCharArray();
        for(char a : str)
            if(Character.isLowerCase(a))
                System.out.print(Character.toUpperCase(a));
            else
                System.out.print(Character.toLowerCase(a));
        System.out.println();
        sc.close();
    }
}

