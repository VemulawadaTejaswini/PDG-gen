
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        for(int i=1;i<10;i++){
            if(N%i==0 && N/i<10){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}