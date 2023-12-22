

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        Map<Long,Integer> map= new HashMap<>();
        long count =0;
        for(int i=0;i<n;i++)
        {
            long saveme=sc.nextInt();
            if(map.get(i-saveme)!=null)
            {
                count=count+map.get(i-saveme);
            }

            map.putIfAbsent(saveme+i,0);
            map.put(saveme+i,map.get(saveme+i)+1);
            //map.put(saveme-i,saveme-i);

        }

        System.out.println(count);
    }
}