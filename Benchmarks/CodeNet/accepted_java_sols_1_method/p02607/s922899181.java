import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i]=scn.nextInt();
            if((i+1)%2==1&&a[i]%2==1){
                count +=1;
            }
        }



        System.out.println(count);


        scn.close();

    }


}
