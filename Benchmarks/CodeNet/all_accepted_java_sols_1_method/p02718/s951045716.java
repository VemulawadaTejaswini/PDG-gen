/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCIANO.
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] item = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            item[i] = in.nextInt();
            total += item[i];
        }
        double requirement = ((double)1 / (4 * m)) * total;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(item[i] >= requirement) cnt += 1;
        }
        if(cnt >= m) System.out.println("Yes");
        else System.out.println("No");
    }
}