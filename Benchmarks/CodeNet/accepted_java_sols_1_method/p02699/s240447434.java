import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s,w;
        s = sc.nextInt();
        w = sc.nextInt();
        if(s<=w){
            System.out.println("unsafe");
        }else {
            System.out.println("safe");
        }
        }


    }
