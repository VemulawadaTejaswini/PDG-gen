import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> suuzi = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            suuzi.add(sc.nextInt());
        }
        Collections.sort(suuzi, Collections.reverseOrder());
        int m = ((suuzi.get(0) * 10) + suuzi.get(1)) + suuzi.get(2);
        System.out.println(m);
    }
}
