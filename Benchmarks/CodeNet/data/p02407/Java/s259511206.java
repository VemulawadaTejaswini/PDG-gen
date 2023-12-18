import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        for(int i=(n-1); i>=0; i--){
            System.out.print(a[i]);
            if(i==0){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }


        scn.close();

    }
}

