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
        String[] nmc = br.readLine().split(" ");
        int n = Integer.parseInt(nmc[0]);
        int m = Integer.parseInt(nmc[1]);
        int c = Integer.parseInt(nmc[2]);
        String[] sbs = br.readLine().split(" ");
        int[] bs = new int[m];
        for (int i = 0; i < m; i++) {
            bs[i] = Integer.parseInt(sbs[i]);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] sas = br.readLine().split(" ");
            int[] as = new int[m];
            for (int k = 0; k < m; k++) {
                as[k] = Integer.parseInt(sas[k]);
            }
        
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += as[j]*bs[j];
            }
            sum += c;
            if (sum>0) count++;
        }
        
        
        System.out.println(count);
    }
}

