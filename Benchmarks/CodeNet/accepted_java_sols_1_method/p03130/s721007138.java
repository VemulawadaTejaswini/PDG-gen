import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        
        for(int i = 0; i < 6; i++){
            num[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 6; i++){
            if(num[i] == 1)count_1++;
            if(num[i] == 2)count_2++;
            if(num[i] == 3)count_3++;
            if(num[i] == 4)count_4++;
        }
        
        if(count_1 == 3 || count_2 == 3 || count_3 == 3 || count_4 == 3 ){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
