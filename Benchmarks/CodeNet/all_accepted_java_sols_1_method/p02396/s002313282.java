import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;;i++){
            int num = Integer.parseInt(sc.nextLine());
            if(num == 0) break;
            else System.out.println("Case " + i + ": " + num );
        }
        sc.close();
    }
}