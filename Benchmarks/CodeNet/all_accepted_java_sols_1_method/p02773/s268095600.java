

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<n; i++) {
            String key = sc.next();
            int a = map.getOrDefault(key, 0) + 1;
            max = Math.max(max, a);
            map.put(key, a);
        }
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key) == max) {
                list.add(key);
            }
        }
        Collections.sort(list);
        for(String key : list) {
            System.out.println(key);
        }


    }



}
