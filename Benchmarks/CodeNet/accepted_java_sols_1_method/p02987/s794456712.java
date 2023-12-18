import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<4;i++){
            if (map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            } else {
                map.put(S.charAt(i),1);
            }
        }
        int cnt = 0;
        if (map.size()==2){
            cnt = 0;
            for (Character c:map.keySet()){
                if (map.get(c)==2){
                    cnt++;
                }
            }
        }
        if (cnt==2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
