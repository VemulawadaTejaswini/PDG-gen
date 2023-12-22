import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] num = str.split(" ",0);
        int a,b;

        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);

        if(a>b){
            System.out.println("a > b");
        }else if(b>a){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
        scan.close();
    }
}

