import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        String[] a = input.split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        if(x > 0 && x < 101 && y > 0 && y < 101){
            int ans = y - x*2;
            if(ans == 0){
                System.out.println("Yes");
            }else if(ans > 0 && (ans % 2) == 0){
                for(int i = 0 ; i < x ; i++){
                    ans = ans - 2;
                    if(ans == 0){
                        System.out.println("Yes");
                        break;
                    }
                }
                if(ans != 0){
                    System.out.println("No");
                }
            }else{
                System.out.println("No");
            }
        }
    }
}
