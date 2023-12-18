import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n,m;
        n = cin.nextInt();
        m = cin.nextInt();
        int sum = 0;
        for(int i= 0;i < m;i++){
            sum += cin.nextInt();
        }
        if(sum > n){
            System.out.println(-1);
        }
        else{
            System.out.println(n-sum);
        }
    }
}
