import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

import java.io.*;

public class Main {
    static int MAX = 4000000;
    
    static int[] A = new int[MAX+10];
    static int F;
    static void maxHeap(int i) {
        int l, r, huge;
        r = 2 * i + 1;
        l = 2 * i;
        
        if(l <= F && A[l] > A[i]) huge = l;
        else huge = i;
        if(r <= F && A[r] > A[huge]) huge = r;

        if(huge != i) {
            int temp = A[i];
            A[i] = A[huge];
            A[huge] = temp;
            maxHeap(huge);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count(sc);
    }
 public static void count(Scanner s){
  F = s.nextInt();
        for(int i = 1; i <= F; ++i) A[i] = s.nextInt();

        for(int i = F / 2; i >= 1; i--) {
        maxHeap(i);
}
        for(int K = 1; K <= F; K++) {
            System.out.print(" " + A[K]);
        }
        System.out.println();
    }
 
 
 }
