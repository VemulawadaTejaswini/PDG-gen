import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int N = input.nextInt();
            int count2 = 0;

            while(N > 0){
                 int a = input.nextInt();

                 while(a % 2 == 0){
                       ++count2;
                       a /= 2;
                 }

                 --N;
            }

            System.out.println(count2);
       }
    }
}