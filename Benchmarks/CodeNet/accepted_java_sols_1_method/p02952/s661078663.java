import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nod = 0;

        int temp = n;
        while (n != 0){
            n/=10;
            nod++;
        }

        long sum = 0;
        for (int i = 0; i < nod; i++) {
            if(i%2!=0){
                sum += Math.pow(10,i-1)*9;
            }
        }

        if(nod%2 != 0){
            sum+= temp - Math.pow(10,nod-1) + 1;
        }

        System.out.println(sum);
    }
}
