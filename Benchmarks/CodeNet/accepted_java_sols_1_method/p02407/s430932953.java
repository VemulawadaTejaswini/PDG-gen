import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int data[] = new int[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            data[i] = x;
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(data[i]);
            if(i != 0)System.out.print(" ");
        }
        System.out.println();
    }
}
