import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = a[i];
        }
        int count = 0;
        int light = 1;
        int flag = 1;
        for(int i = 0; ; i++){
            if(light != 2 && copy[light-1] != 0){
                copy[light-1] = 0;
                light = a[light-1];
                count++;
            } else if(copy[light-1] == 0){
                flag = 0;
                break;
            } else if(light == 2){
                break;
            }
        }
        if(flag == 0){
            System.out.print("-1");
        } else {
            System.out.print(count);
        }
    }
}