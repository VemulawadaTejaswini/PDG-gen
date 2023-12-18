import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            double ave = 0;
            double bun = 0;
            double bunm = 0;
            if(n == 0){
                break;
            }
            int[] ten = new int[n];
            for(int i = 0; i < ten.length;i++){
                ten[i] = sc.nextInt();
            }
            for(int i = 0;i <ten.length; i++){
                ave += ten[i];
            }
            ave = ave/ten.length;

            for(int i = 0;i < ten.length;i++){
                bunm = ten[i] - ave;
                bun += bunm*bunm;
            }
            bun = bun/ten.length;
            System.out.println(Math.sqrt(bun));
        }
        sc.close();
    }
}
