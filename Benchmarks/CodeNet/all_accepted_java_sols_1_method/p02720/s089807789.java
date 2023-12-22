/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCIANO.
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int cur;
        List<String> list = new ArrayList<>();
        for(int i = 1; i < 10; i++) list.add(i + "");
        if(k <= 9) {
            System.out.println(list.get(k - 1));
        }else {
            int cnt = 9;
            int index = 0;
            while(cnt < k) {
                int len = list.get(index).length();
                int last = Integer.parseInt(String.valueOf(list.get(index).charAt(len - 1)));
                if(last != 0) {
                    list.add(list.get(index) + "" + (last - 1));
                    cnt += 1;
                }
                if(cnt < k) {
                    list.add(list.get(index) + "" + last);
                    cnt += 1;
                }
                if((cnt < k) && (last != 9)) {
                    list.add(list.get(index) + "" + (last + 1));
                    cnt += 1;
                }
                index += 1;
            }
            System.out.println(list.get(list.size() - 1));
        }
    }
}