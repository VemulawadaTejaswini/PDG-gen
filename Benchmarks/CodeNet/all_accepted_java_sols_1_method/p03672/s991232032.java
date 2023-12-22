

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        List<String> strs = new LinkedList<>();
        for(int i = input.length() - 1;i > -1;i--)
            strs.add(input.substring(0,i));
        strs.stream().filter(check).max(Comparator.comparing(String::length)).ifPresent(e -> System.out.println(e.length()));
    }
    static Predicate<String> check = str -> {
        if(str.length() % 2 != 0)
            return false;
        else
        {
            int half = str.length() / 2;
            return (str.substring(0,half).equals(str.substring(half,str.length())));
        }
    };
}
