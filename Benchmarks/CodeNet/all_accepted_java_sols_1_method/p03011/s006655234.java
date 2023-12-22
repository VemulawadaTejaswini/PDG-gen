import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int p = stdIn.nextInt();
        int q = stdIn.nextInt();
        int r = stdIn.nextInt();

        if(p>=q && p >= r){
            System.out.println(q+r);
        }else if(q >= p && q >= r){
            System.out.println(p+r);
        }else{
            System.out.println(p+q);
        }
    }
}