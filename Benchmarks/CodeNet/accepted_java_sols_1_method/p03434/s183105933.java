import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer a[] = new Integer[N];
        boolean s = true;
        int Alice = 0;
        int Bob = 0;

        for(int i = 0;i < N;i++){
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());
        for(int i = 0;i < N;i++){
            if(s){
                Alice += a[i];
            }else{
                Bob += a[i];
            }
            s = !s;
        }

        System.out.println(Alice - Bob);
        }
}