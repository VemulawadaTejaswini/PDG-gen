import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Arifur on 9/8/2015.
 */
public class Main {
    public static void main(String[] arg) {
        Scanner scanner=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x=scanner.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            list.add(scanner.nextInt());
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i<x-1){
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}