import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i = 0;i<n;i++){
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d);
        if(n == 2){
            System.out.println(d[1] - d[0]);
        }else{
            int a = d[d.length/2] - d[d.length/2 -1];
            if(d[d.length/2 -1] - d[d.length/2] == 0 && d[d.length/2-1] - d[d.length/2 -2] == 0){
                a -= 1;
            }
            if(a <= 0){
                System.out.println(0);
            }else{
                System.out.println(a);
            }
        }
    }
}