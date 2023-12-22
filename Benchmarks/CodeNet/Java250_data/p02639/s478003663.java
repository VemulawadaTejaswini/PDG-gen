import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {       
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int k = sc.nextInt();
            if (k==0) {
                System.out.println(i+1);
            }
        }
    }
}
