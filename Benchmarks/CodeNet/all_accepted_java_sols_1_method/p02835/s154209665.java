import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() + sc.nextInt() + sc.nextInt() <= 21) {
            System.out.println("win");
        }
        else {
            System.out.println("bust");
        }
    }
}
