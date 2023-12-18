import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int x = scan.nextInt();
            if(x != 0) {
                int c = 1;
                System.out.println("Case " + c + " : " + x);
                c++;
            }
        }



    }
}

