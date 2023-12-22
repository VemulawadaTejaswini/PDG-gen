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
        long n = in.nextLong();
        long k = in.nextLong();
        if(n == k) System.out.println(0);
        else if(n < k) {
            System.out.println(Math.min(n, (k - n)));
        }else {
            long rem = n % k;
            System.out.println(Math.min(rem, Math.abs(rem - k)));
        }
    }
}