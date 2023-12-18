import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int ansA = 0;
        int ansB = 0;

            outside: for(int a = -118;a <= 119;a++){
                for(int b = -119;b <= 118;b++){
                    if(Math.pow(a,5) - Math.pow(b,5) == x){
                        ansA = a;
                        ansB = b;
                        break outside;
                    }
                }
        }
        System.out.println(ansA + " " + ansB);
    }
}
