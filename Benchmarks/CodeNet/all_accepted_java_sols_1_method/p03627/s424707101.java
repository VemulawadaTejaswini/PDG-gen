import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        HashMap<Long,Long> count = new HashMap<>();
        for(int i=0;i<N;i++){
            Long a = scanner.nextLong();
            if(count.containsKey(a)){
                count.put(a, count.get(a) + 1);
            }else{
                count.put(a,Long.valueOf(1));
            }
        }
        Long first = Long.valueOf(0);
        Long second = Long.valueOf(0);
        for(Long key :count.keySet()){
            if(count.get(key) >= 2){
                if(first < key){
                    first = key;
                }
            }
        }
        if(first!=0 && count.get(first)>=4){
            second = first;
        }else{
            for(Long key :count.keySet()){
                if(count.get(key) >= 2){
                    if(second < key && key!=first){
                        second = key;

                    }
                }
            }
        }
        System.out.println(first * second);
    }
}