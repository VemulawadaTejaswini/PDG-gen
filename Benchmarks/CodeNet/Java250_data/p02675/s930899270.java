import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int num = N;
        if(N>10) {
            num = N % 10;
        }
        if(num==3){
            System.out.println("bon");
        }else if(num==0 || num==1 || num==6 || num==8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}
