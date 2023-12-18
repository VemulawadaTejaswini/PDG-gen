import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),i=1,x;

        while(i<=N){
            x = i;
            if(x%3 == 0){
                System.out.print(" "+i);
                i += 1;
            }
            while(x >10){
                if(x%10 == 3){
                    System.out.print(" "+i);
                    break;
                }
                x /= 10;
            }
            i += 1;
        }

    }
}

