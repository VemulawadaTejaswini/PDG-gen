import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sinpou = sc.nextInt();
        int order = 0;
        int c = 1;
        while(c <= num) {
            c *= sinpou;
            order++;
        }
        sc.close();
        System.out.println(order);

 
    }

}