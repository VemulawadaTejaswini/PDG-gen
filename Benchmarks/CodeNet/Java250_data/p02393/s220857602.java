import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       ArrayList<Integer> intArr = new ArrayList<Integer>();
       for(int i=0;i<3;i++) intArr.add(in.nextInt());
       Collections.sort(intArr);
       System.out.printf("%d %d %d\n",
		       intArr.get(0), intArr.get(1), intArr.get(2));
    }
}