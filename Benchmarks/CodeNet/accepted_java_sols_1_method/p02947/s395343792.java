    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            String[] sList = new String[n];
            for(int i=0;i<n;i++)
                sList[i]=in.next();
            HashMap<String,Long> freqMap = new HashMap<>();
            for(int i=0;i<n;i++){
                char[] cur= sList[i].toCharArray();
                Arrays.sort(cur);
                String temp = new String(cur);
                if(!freqMap.containsKey(temp))
                    freqMap.put(temp,0L);
                freqMap.put(temp,freqMap.get(temp)+1);
            }   
            long ans=0;
            for(String x:freqMap.keySet())
                ans+=(1L*freqMap.get(x)*(freqMap.get(x)-1))/2;
            System.out.println(ans);
        }
    }