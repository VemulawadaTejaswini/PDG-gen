import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static StringBuffer sb = new StringBuffer();
    public static void main(String args[]){
        int n=sc.nextInt();
        long k=sc.nextLong();
        Map<Integer,Long> a=new TreeMap<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(!a.containsKey(temp)) a.put(temp,(long)0);
            a.replace(temp,a.get(temp)+sc.nextInt());
        }
        long res=0;
        for(int key:a.keySet()){
            k-=a.get(key);
            if(k<=0){
                res=key;
                break;
            }
        }
        System.out.println(res);
    }
}