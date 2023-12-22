import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int totalL = 0;
        int max = 0;
        for(int i=0;i<N;i++){
            int L = scan.nextInt();
            totalL = totalL+L;
            if(L > max){
                max = L;
            }
        }
        scan.close();

        totalL = totalL - max;

        if(max < totalL){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}