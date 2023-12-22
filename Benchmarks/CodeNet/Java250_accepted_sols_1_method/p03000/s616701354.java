import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int zone = scan.nextInt();
        int pos = 0;
        int count = 1;
        for(int i = 0; i < num; i++){
            pos += scan.nextInt();
            if(pos <= zone){
                count++;
            }
        }

        // answer
        System.out.println(count);

    }
}