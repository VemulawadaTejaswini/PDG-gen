import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int[] a = new int[1000001];
        a[1] = s;
        
        for (int i = 2; i < 1000001; i++) {
            if (a[i-1]%2==0) {
                a[i] = a[i-1]/2;
            }
            else {
                a[i] = 3*a[i-1]+1;
            }
        }
        
        for (int i = 2; i < 1000001; i++) {
            for (int j = i-1; 0 < j; j--) {
                if (a[i] == a[j]) {
                    System.out.println(i);
                    return;
                }
            }
        }
        
        
    }
}

