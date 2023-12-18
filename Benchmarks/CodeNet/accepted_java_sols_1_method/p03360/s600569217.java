import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        List<Long> number = new ArrayList<Long>(){
            {
                add(Long.parseLong(sc.next()));
                add(Long.parseLong(sc.next()));
                add(Long.parseLong(sc.next()));
            }
        };
        
        Collections.sort(number, Comparator.reverseOrder());
        
        long K = Long.parseLong(sc.next());
        
        for(long i=0; i<K; i++){
            number.set(0, number.get(0)*2);
        }
        
        System.out.println(number.get(0) + number.get(1) + number.get(2));
    }
}