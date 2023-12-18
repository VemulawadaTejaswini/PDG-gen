
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<2*N;i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr,Collections.reverseOrder());

        int total_meals=0;
        for(int i=0;i<2*N;i+=2){
            total_meals +=Math.min(arr.get(i), arr.get(i+1));
        }
        System.out.println(total_meals);


    }
}
