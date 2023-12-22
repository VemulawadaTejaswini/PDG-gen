import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int curr = sc.nextInt();
            if (curr == 0) {
                System.out.println(i + 1);
                break;
            }
        }
        
    }
}
