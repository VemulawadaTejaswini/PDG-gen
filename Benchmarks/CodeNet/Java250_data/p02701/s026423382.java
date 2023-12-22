import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String k = sc.next();
            if(!map.containsKey(k)){
                map.put(k, "a");
            }
            
        }
        System.out.println(map.size());

    }
}