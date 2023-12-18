import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int n,a=0,p=0;
        n = tan.nextInt();
        while(n!=0){
            a=n%10;
            n=n/10;
            if(a==7){
                p++;
                break;
            }
        }
        if(p==0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
