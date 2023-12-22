import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int S = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());

        if(W >= S){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }

        sc.close();
    }

}