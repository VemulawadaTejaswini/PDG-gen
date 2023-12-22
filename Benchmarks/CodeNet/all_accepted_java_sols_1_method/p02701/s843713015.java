import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Map<String,Boolean> map = new HashMap<>();
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(!map.containsKey(s)){
                count++;
                map.put(s,true);
            }
        }
        System.out.println(count);
    }
}