
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int list[] = new int[3];
        list[0] = scan.nextInt();
        list[1] = scan.nextInt();
        list[2] = scan.nextInt();
        
        int n = 0;
        for(int i = 1;i < 3;i++){
           if(list[n] > list[i])n = i;

        }
        System.out.print(list[n]+" ");

        int a = 0,b = 0;
        switch(n){
            case 0:
                a = list[1];
                b = list[2];
                break;
            case 1:
                a = list[0];
                b = list[2];
                break;
            case 2:
                a = list[0];
                b = list[1];
                break;

        }

        if(a < b)System.out.println(a + " " + b);
        else System.out.println(b + " " + a);

        scan.close();
    }
}
