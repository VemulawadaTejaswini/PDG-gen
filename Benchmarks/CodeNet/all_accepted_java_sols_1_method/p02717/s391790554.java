
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wnqmw
 */
public class Main {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        
        int x = kb.nextInt(), y = kb.nextInt(), z = kb.nextInt();
        int temp = y;
        y = x;
        x = temp;
        
        temp = z;
        z = x;
        x = temp;
        System.out.println(x + " " + y + " " + z);
    }
}
