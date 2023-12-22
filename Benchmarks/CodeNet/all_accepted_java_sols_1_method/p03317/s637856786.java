import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] y = sc.nextLine().split(" ");
        int[] x = new int[y.length];
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0;i<x.length;i++){
            x[i] = Integer.parseInt(y[i]);
            if(min>x[i]){
                min = x[i];
                count = 1;
            }else if(min==x[i]){
                count++;
            }
        }
        int answer = (n-count+k-2)/(k-1);
        System.out.println(answer);
    }
}