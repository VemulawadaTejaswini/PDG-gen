import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }
        Collections.sort(arr, Collections.reverseOrder());

        if(arr.get(M - 1) * (M * 4) < sum) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
