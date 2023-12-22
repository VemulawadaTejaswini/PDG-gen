import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumA = 0;
        int sumB = 0;
        List<Integer> nums = new LinkedList<>();

        for(int i=0; i<n; i++){
            nums.add(sc.nextInt());
        }

        for(int i=1; i<n+1; i++){
            if(i%2 != 0){
                sumA += Collections.max(nums);
                nums.remove(nums.indexOf(Collections.max(nums)));
            }else{
                sumB += Collections.max(nums);
                nums.remove(nums.indexOf(Collections.max(nums)));
            }
        }

        System.out.println(sumA - sumB);


    }
}
