import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
        int a[] = new int[5];
        int ten[] = new int[5];
        int one[] = new int[5];

        int min=9;


        for (int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }

        for (int i=0; i<5; i++){
            ten[i] = a[i]/10;
            if (a[i]%10!=0) ten[i] = a[i]/10+1;
        }
        for (int i=0; i<5; i++){
            one[i] = a[i]%10;
            if ((one[i]!=0)){
                min= Math.min(min, one[i]);
            }
        }
        int total=0;
        for (int i=0; i<5; i++){
            total += ten[i]*10;
        }
        if ((a[0]%10==0)&(a[1]%10==0)&(a[2]%10==0)&(a[3]%10==0)&(a[4]%10==0)) {
            System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);
//        for (int i=0; i<5; i++) System.out.println(a[i]);
        }else{
            System.out.println(total-10+min);

        }
    }
}

