import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        int sub1 = 0, sub2 =0;
        for(int i = 0; i < 3; i++){
            for(int ii = i+1; ii < 3; ii++ ){
                if(x[i] > x[ii]){
                    sub1 = x[i];
                    sub2 = x[ii];
                    x[i] = sub2;
                    x[ii] = sub1;
                }
            }
        }

        for(int num : x){
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
