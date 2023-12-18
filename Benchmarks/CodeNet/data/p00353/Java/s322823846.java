
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int f = scan.nextInt();
        int b = scan.nextInt();
        if(m<b && m+f>=b){
        System.out.println(b-=m);
        }else if(m<b && f<b){
    System.out.println("NA");

    }

}
}

