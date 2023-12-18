import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int t=0;

        while(x!=0||y!=0){
            if(x>y){
                t=x;
                x=y;
                y=t;
                System.out.println(x+" "+y);
            }else{
                System.out.println(x+" "+y);
            }
        x = scanner.nextInt();
        y = scanner.nextInt();
        }
    }
    
}
