import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for(int i=0; i<6; i++){
            int tmp = sc.nextInt();
            num[tmp-1]++;
        }

        if(Arrays.stream(num).max().getAsInt() >= 3){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}