import java.util.*;

public class Main {
    public static int ans[] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int list[] = new int[n];

        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        int count = 0;
        boolean flag = true;
        while(flag){
            for(int i=0;i<n;i++){
                if(list[i]%2 == 1){
                    flag = false;
                }
                list[i] = list[i]/2;
                if(i == n-1 && flag){count++;}
            }
        }
        System.out.println(count);
    }
}
