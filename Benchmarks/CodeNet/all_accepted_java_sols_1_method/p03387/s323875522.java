
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Main{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        queue.add(input.nextInt());
        queue.add(input.nextInt());
        queue.add(input.nextInt());
        int count = 0;
        while (true) {
            int a = queue.remove();
            int b = queue.remove();
            int c = queue.remove();
            if (a == b && b == c) {
                break;
            }
            if (a + 1 <= c && b + 1 <= c) {
                count++;
                a++;
                b++;
            }else {
                a+= 2;
                count++;
            }
            queue.add(a);
            queue.add(b);
            queue.add(c);
        }
        System.out.println(count);
    }
}
