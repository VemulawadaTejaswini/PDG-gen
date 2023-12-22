
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
        String iu = input.next();
        StringBuffer inu = new StringBuffer(iu);
        System.out.println(inu.reverse());
    }
}