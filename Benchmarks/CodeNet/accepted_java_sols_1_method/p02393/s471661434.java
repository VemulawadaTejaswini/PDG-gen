import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3]; 
        for(int i=0; i<3; i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[0]+" "+n[1]+" "+n[2]);

    }
}

