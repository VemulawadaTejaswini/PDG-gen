import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }
        int count = 0;
        for(int a: map.keySet()){
            //System.out.println(a + " : " + map.get(a));
            if(a <= map.get(a)){
                count += map.get(a) - a;
            }else {
                count += map.get(a);
            }
        }
        System.out.println(count);
    }
}