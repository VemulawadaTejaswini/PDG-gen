import java.io.BufferedInputStream;
import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int m[]=new int[a];
        int min=a;
        int count=0;
        for(int i=0;i<a;i++) {
            m[i] = sc.nextInt();
            if(m[i]<min)
                min=m[i];
            if(m[i]<=min)
                count++;
        }
        System.out.println(count);
    }
}
