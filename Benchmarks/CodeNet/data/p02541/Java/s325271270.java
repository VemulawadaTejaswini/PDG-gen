import java.util.Scanner;

public class Main {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        long n=0,i=0,k=0;
        if(sc.hasNextInt())
            n=sc.nextInt();
        while(true){
            i++;
            k+=i;
            if(k%n==0)
                break;
        }
        System.out.println(i);
    }
}
