import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[1000000];
        Arrays.fill(a, 1);
        a[0] = a[1] = 0;
        for(int i = 2; i < a.length; i++){
            if(a[i] == 1){
                for(int j = i * 2; j < a.length; j += i){
                    a[j] = 0;
                }
            }
        }
        for(int i = 1; i < a.length; i++){
            a[i] = a[i] + a[i - 1];
        }
        while(in.hasNextLine()){
            System.out.println(a[in.nextInt()]);
        }
    }
}