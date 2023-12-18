import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum = sc.nextInt(),min = sum,max = sum;
        for(int i = 1;i < n;i++){
            int a = sc.nextInt();
            sum+=a;
            if(max < a) max = a;
            else if(a < min) min = a;
        }
        System.out.printf("%d %d %d\n",min,max,sum);
    }

}