import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str);

        if(a >= 3){
            for(int loop = 1; loop <= a; loop++){
                if(loop % 3 == 0) System.out.print(" " + loop);
                else {
                    for(int x = loop; x > 0; x/=10){
                        if(x % 10 == 3) {
                            System.out.print(" " + loop);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println();
    }
}