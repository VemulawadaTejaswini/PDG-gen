import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int before = sc.nextInt();
        int num = 0;
        for(int i=0;i<N-1;i++){
            int now = sc.nextInt();
            if(before<now){
                if(num>max) max = num;
                num = 0;
            }
            else if(before>=now&&i!=N-2) num++;
            else if(before >= now && i==N-2){
                num++;
                if(num > max) max = num;
            }
            before = now;
        }
        System.out.println(max);
    }
}