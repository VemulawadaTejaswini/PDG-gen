import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 2){
            System.out.println(a);
            return;
        }
        ArrayList<Integer> list = getPrime(a);
        while(true){
            if(check(a,list)){
                System.out.println(a);
                return;
            }
            a++;
        }
    }
    
    static ArrayList<Integer> getPrime(int x){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        int max = (int)Math.pow(x*2,0.5);
        for(int i = 3; i < max; i+=2){
            boolean chk = true;
            for(int j : list){
               if(i % j == 0){
                   chk = false;
                   break;
               }
            }
            if(chk){
                list.add(i);
            }
        }
        return list;
    }
    
    static boolean check(int x, List<Integer> list) {
        for(int j : list){
           if(x % j == 0){
               return false;
           }
        }
        return true;
    }
}

