import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=1;
        int j = sc.nextInt();
        while(j!=0){
            System.out.println("Case " + i + ": " + j);
            j = sc.nextInt();
            i++;
        }
    }
}
