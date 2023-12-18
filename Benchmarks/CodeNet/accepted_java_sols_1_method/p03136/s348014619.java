import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0; i<n; i++){
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        int other = 0;
        for(int i=0; i<n-1; i++){
            other += l[i];
        }

        if(other > l[n-1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}