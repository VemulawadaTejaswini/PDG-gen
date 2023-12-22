import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            char[]c = sc.nextLine().toCharArray();
            Arrays.sort(c);
            list.add(new String(c));
        }
        
        Collections.sort(list);
        
        long anagram = 0;
        long answer = 0;
        String s = list.get(0);
        for(int i = 1; i < n; i++){
            if(s.equals(list.get(i))){
                anagram += 1;
            }else{
                long a = 0;
                for(long j = 0; j < anagram; j++){
                    a += j+1;
                }
                answer += a;
                anagram = 0;
                s = list.get(i);
            }
        }
        if(list.get(n-1).equals(list.get(n-2))){
            long a = 0;
            for(long i = 0; i < anagram; i++){
                a += i+1;
            }
            answer += a;
        }
        
        System.out.println(answer);
    }
}