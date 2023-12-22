import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] s = new int[n];
        Arrays.fill(s , 0);
        for(int i = 0 ; i < k ; i++){
            int d = sc.nextInt();
            int[] a = new int[d];
            for(int j = 0 ; j < d ; j++){
                a[j] = sc.nextInt() - 1;
                s[a[j]]++;
            } 
        }
        sc.close();
        Arrays.sort(s);
        int yono = 0;
        while(s[yono] == 0){
            yono++;
        }
        System.out.println(yono);
    }
}