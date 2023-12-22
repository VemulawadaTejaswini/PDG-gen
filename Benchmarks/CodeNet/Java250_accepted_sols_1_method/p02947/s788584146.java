import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[]po=new String[n];
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char po2[]=sc.next().toCharArray();
            Arrays.sort(po2);
            po[i]=String.valueOf(po2);
            if(map.containsKey(po[i])){
                map.put(po[i],map.get(po[i])+1);
            }
            else 
                map.put(po[i],0);
        }
        Arrays.sort(po);
        long ans=0;
        for(String key:map.keySet()){
            ans+=(long)(map.get(key))*(map.get(key)+1)/2;
        }
        System.out.println(ans);
    }
}
