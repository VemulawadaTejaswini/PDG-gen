import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 10000000;
        int max = -10000000;
        long sum = 0;

        for(int i = 0;i < n;i++){
            int x [] =new int[n];
            x[i]= sc.nextInt();

            if(min >  x[i]){
                min =  x[i];
            }
            if(max < x[i]){
                max = x[i];
            }
            sum += x[i];

        }
        System.out.println(min + " " + max + " " + sum);
        sc.close();
    }

}
