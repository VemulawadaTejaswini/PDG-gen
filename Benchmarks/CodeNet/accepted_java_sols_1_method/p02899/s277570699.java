import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        Integer h[]=new Integer[n];
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),i);
        }
        for(Integer value:map.values()){
            System.out.println(value+1);
        }
    }
}