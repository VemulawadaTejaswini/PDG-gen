import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = 0;
        int b = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        Collections.reverse(list);

        for(int i = 0; i < n; i++){
            if(i % 2 == 0) a += list.get(i);
            else b += list.get(i);
        }

        System.out.println(a - b);

        sc.close();
    }
}