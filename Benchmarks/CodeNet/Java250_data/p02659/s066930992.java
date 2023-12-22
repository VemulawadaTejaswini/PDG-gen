import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long A = Long.parseLong(sc.next());
        String B = sc.next();
        String[] B_array = B.split("\\.",-1);
        System.out.println(A*Long.parseLong(B_array[0]) +(A*Integer.parseInt(B_array[1]))/100 );
    }
}