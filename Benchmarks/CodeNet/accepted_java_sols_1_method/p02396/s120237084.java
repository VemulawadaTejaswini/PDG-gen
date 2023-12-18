import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            if(x==0)break;
            System.out.println("Case "+n+": "+x);
            n++;
        }
        sc.close();
    }
}
