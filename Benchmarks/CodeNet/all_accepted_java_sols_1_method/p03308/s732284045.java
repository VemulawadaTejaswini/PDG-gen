import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int min=999999999,max=0;
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(max<num) max = num;
            if(min>num) min = num;
        }
        System.out.println(Math.abs(max-min));
    }
}
