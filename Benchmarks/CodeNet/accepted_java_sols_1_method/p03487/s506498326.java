import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),m=0,res=0;
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0;i<N;i++){
            int t=sc.nextInt();
            if(!c.containsKey(t)){
                c.put(t,1);
            }
            else{
                c.put(t,c.get(t)+1);
            }
            m=Math.max(c.get(t),m);
        }
        for(int i:c.keySet()){
            if(c.get(i)<i){
                res+=c.get(i);
            }
            else{
                res+=Math.min(c.get(i),c.get(i)-i);
            }
        }
        System.out.println(res);
    }
}