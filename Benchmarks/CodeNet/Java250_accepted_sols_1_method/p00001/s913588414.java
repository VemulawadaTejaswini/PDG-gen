import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int max1=0,max2=0,max3=0;
        for (int i=1;i<=10;i++){
            int h=sc.nextInt();
            if (h>max1){
                max3=max2;
                max2=max1;
                max1=h;
            }
            else if (h>max2){
                max3=max2;
                max2=h;
            }
            else if (h>max3)
                max3=h;
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}