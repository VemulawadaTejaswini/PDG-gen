import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<3; i++){
            int num = Integer.parseInt(sc.next());
            if(map.get(num) == null){
                map.put(num, 1);
            }
        }
        
        System.out.println(map.size());
    }
}