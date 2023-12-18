import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.printf("%.10f %.10f\n",r*r*Math.PI, 2*r*Math.PI );

    }

    public static void main(String[] args){
        new Main();
    }
}

