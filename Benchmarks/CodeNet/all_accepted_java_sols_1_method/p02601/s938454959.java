import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        boolean flag = false;

        for(int i=0; i<=k; i++){
            int temp = b * (int)Math.pow(2, i);
            if(a < temp){
                for(int j=0; j<=k-i; j++){
                    if(temp < c * (int)Math.pow(2, j)){
                        flag = true;
                        break;
                    }
                }
            }
        }

        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}