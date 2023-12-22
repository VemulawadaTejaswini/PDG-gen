import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        for(int i=0; i<5; i++) x[i]=sc.nextInt();
        for(int i=0; i<5; i++) if(x[i]==0) System.out.println(i+1);
    }
}