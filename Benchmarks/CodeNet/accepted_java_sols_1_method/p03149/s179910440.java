import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0; i<4; i++){
            int n = sc.nextInt();
            num[n]++;            
        }

        if(num[1] == 1 && num[9] == 1 && num[7] == 1 && num[4] == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}