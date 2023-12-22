import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int a=0;
        int b=0;
        for(int i=-200; i<200; i++) {
            for(int j=0; j<200; j++) {
                if(Math.pow(j,5)-Math.pow(i, 5)==X) {
                    a=j;
                    b=i;
                    break;
                }
            }
        }
        System.out.println(a+" "+b);

    }

}
