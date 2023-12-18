import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, i = 1;
        while(true){
            a = sc.nextInt();
            if(a == 0) break;
            System.out.println("case "+i+": "+a);
            i++;
        }
    }
}
