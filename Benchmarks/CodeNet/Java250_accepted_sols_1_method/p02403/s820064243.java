import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        while(H!=0 && W !=0){
            int w = W;
            while(H != 0){
                while(w !=0){
                    System.out.print("#");
                    w--;
                }
                System.out.println("");
                H--;
                w = W;
            }
            H = scan.nextInt();
            W = scan.nextInt();
            System.out.println("");
        }
    }
}
