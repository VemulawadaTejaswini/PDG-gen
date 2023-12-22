import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        HashMap<String,Integer> r=new HashMap<>();
        HashMap<String,Integer> b=new HashMap<>();
        int N=sc.nextInt(),res=0;
        for(int i=0;i<N;i++){
            String t=sc.next();
            if(!b.containsKey(t)) b.put(t,0);
            b.put(t,b.get(t)+1);
        }
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            String t=sc.next();
            if(!r.containsKey(t)) r.put(t,0);
            r.put(t,r.get(t)+1);
        }
        for(String key:b.keySet()){
            if(r.containsKey(key)){
                res=Math.max(res,b.get(key)-r.get(key));
            }
            else{
                res=Math.max(res,b.get(key));
            }
        }
        System.out.println(res);
    }
}