

import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int cur = 1000;
       while(cur<input){
           cur+=1000;
       }
        System.out.println(cur-input);
    }

}