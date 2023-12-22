
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
        
        int yen = kb.nextInt();
        int total = 0;
        total += (yen/500)*1000;
        yen -= (yen/500)*500;
        total += (yen/5)*5;
        
        System.out.println(total);
        
    }
}
