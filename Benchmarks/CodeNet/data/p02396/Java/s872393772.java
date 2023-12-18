package com.company;
//import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        int i = 1;
        while(true){
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int num = Integer.parseInt(str);
            // int num = sc.nextString();
            if (num == 0) {
                break;
            }
            System.out.println("Case "+i+": "+num);
            i++;
        }
    }
}