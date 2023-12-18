//package basics.AtCoders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            int e =s.nextInt();
            list.add(e);
        }
        int heightOfStool=0;
            for(int i=0;i<n-1;i++){
                int change=0;
                if(list.get(i+1)<list.get(i)){
                   change = list.get(i)-list.get(i+1);
                   list.set(i+1,list.get(i+1)+change);
                }
                heightOfStool+=change;
            }

        System.out.println(heightOfStool);

    }
}
