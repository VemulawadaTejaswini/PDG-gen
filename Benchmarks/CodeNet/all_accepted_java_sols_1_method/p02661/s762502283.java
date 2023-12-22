import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        for(int i=0;i<N;i++){
            min.add(sc.nextInt());
            max.add(sc.nextInt());
        }
        Collections.sort(min);
        Collections.sort(max);
        if(N%2 == 1){
            System.out.println(max.get(N/2) - min.get(N/2) + 1);
        }else{
            System.out.println(((max.get(N/2) + max.get(N/2-1)) - (min.get(N/2) + min.get(N/2-1)))+ 1);
        }
    }
}