import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        for(int i = 1;i <= n;i++){
            int tmp = i,dig = 0;
            while(tmp > 0){
                dig += (tmp%10);
                tmp /= 10;
            }
            if(dig >= a && dig <= b)sum += i;
        }
        System.out.println(sum);
    }
}