import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            System.out.println("Case "+n+": "+x);
            if(x==0)break;
            n++;
        }
        sc.close();
    }
}
