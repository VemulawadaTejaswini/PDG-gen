import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i = 1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            if(n != 0){
                System.out.println("Case " + i + ": " + n);
                i++;
            }
            else {
                break;
            }
        }
    }

}

