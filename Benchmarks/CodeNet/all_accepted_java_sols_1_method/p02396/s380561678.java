import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b = 0;
        while (true){
            a = scan.nextInt();
            if(a == 0){
                break;
            }else{
                b++;
            }
              System.out.printf("Case %d: %d\n",b,a);
        }
    }
}
