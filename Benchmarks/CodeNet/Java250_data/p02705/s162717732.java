import java.util.Scanner;

// import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }

    private void run(){
        int r = sc.nextInt();

        System.out.println(2*Math.PI*r);
    }
}
