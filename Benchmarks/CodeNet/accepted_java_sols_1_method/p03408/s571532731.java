import java.util.*;


public class Main{
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);

        final int m = sc.nextInt();
        Map<String,Integer> smap = new HashMap<String,Integer>();
        for(int i=0; i<m; i++){
            String tmp = sc.next();
            if(smap.get(tmp)!=null){
                smap.put(tmp,smap.get(tmp)+1);
            }
            else{
                smap.put(tmp,1);
            }
        }

        final int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String tmp = sc.next();
            if(smap.get(tmp)!=null)
                smap.put(tmp,smap.get(tmp)-1);
        }
        int max=0;
        for(String str: smap.keySet()){
            if(max<smap.get(str))
              max=smap.get(str);
        }
        System.out.println(max>0?max:0);

    }
}
