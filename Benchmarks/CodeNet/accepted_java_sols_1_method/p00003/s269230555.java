
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x =input.nextInt();
         for (int i = 0; i < x; i++) {
            ArrayList<Integer> out = new ArrayList<Integer>();
             for (int j = 0; j < 3; j++) {
                 out.add(input.nextInt());
             }
             Collections.sort(out);
             System.out.println(Math.pow(out.get(out.size()-1), 2)==Math.pow(out.get(0), 2)+Math.pow(out.get(1), 2)?"YES":"NO");
        }
    }
}