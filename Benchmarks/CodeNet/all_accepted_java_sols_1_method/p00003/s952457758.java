import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(int i=0;i<n;i++) {
           ArrayList<Integer>intArr = new ArrayList<Integer>();
           for(int j=0;j<3;j++)
               intArr.add(in.nextInt());
           Collections.sort(intArr);
           Collections.reverse(intArr);
           int c = intArr.get(0);
           int a = intArr.get(1);
           int b = intArr.get(2);
           if(a*a + b*b == c*c) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
       }
    }
}