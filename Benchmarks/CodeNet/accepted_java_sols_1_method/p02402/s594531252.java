import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int up = 0 - 1000001;
        int down = 1000001;
        long sum = 0;

        for(int i = 0; i < n; i++){
            int n_i = sc.nextInt();

            if(n_i > up){
                up = n_i;
            }

            if(n_i < down){
                down = n_i;
            }

            sum += n_i;
        }

        System.out.println(down + " " + up + " " + sum);
    }
}
