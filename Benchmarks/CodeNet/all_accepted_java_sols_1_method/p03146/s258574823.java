import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a[] = new boolean[1000001];
        int tmp = sc.nextInt();
        
        for(int i = 1;i<1000000;i++){
            a[tmp] = true;

            if(tmp % 2 == 0){
                tmp = tmp/2;
            }else{
                tmp = tmp*3+1;
            }

            if(a[tmp] == true){
                tmp = i+1;
                break;
            }
        }

        System.out.println(tmp);
    }
}