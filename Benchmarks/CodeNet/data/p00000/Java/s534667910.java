import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        int ans = 0;
        for(int i = 0; i < 9; i++){
            a = i + 1;
            for(int j = 0; j < 9; j++){
                b = j + 1;
                ans = a * b;
                System.out.println(a+"x"+b+"="+ans);
            }
        }
    }
}