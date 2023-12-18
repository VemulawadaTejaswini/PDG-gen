import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        int count = 0;
        for (int i = N-1; i >= 1 ; i--) {//C
            int AB = N-i;
            for (int A = 1; A*A<=AB  ; A++) {//A

                if(AB % A==0){
                    int B = AB/A;
                    if(A!=B){
                      count+=2;
                    }else{
                        count++;
                    }
                }
            }
        }


        System.out.println(count);

    }

}
