import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int rabbit = cin.nextInt();
        int count = 0;
        List<Integer> rabbitarray = new ArrayList<Integer>();
        for(int i=0;i < rabbit;i++){
            int next = cin.nextInt();
            rabbitarray.add(next);
        }
        for(int j=0;j < rabbit;j++) {
            int check = rabbitarray.get(j);
            if (check > 0){
            int check2 = rabbitarray.get(check - 1);
                if(check2 > 0) {
                    if (check == rabbitarray.get(check2 - 1)) {
                        count++;
                        if (check != 0) {
                            rabbitarray.set(check - 1, 0);
                        }
                        if (check2 != 0) {
                            rabbitarray.set(check2 - 1, 0);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}