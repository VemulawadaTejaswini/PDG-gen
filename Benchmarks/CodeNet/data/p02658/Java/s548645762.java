import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long max = (long) Math.pow(10, 18);
        long sum = 1;
        long[] a = new long[n];
        boolean check = true;

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                check = false;
                break;
            } else if (a[i] > max) {
                System.out.println(-1);
                check = false;
                break;
            }


        }

        if (check) {
            for(int i=0;i<n;i++){
                sum = sum*a[i];
                if(sum>max){
                    System.out.println(-1);
                    check=false;
                }
            }
            if(check){
                System.out.println(sum);
            }

        }

        scn.close();


    }


}