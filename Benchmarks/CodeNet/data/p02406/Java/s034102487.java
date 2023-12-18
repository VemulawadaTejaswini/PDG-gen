import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0){
                System.out.printf(" %d",i);
            }
            else{
                int n = i;
                while(n != 0){
                    if(n % 10 == 3){
                        System.out.printf(" %d",i);
                        break;
                    }
                    n /= 10;
                }
            }
        }
        System.out.printf("\n");
    }
}
