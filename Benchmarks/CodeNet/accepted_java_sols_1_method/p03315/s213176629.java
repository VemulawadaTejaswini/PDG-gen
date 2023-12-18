import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char tar ='+';
        int a =0;

        for(char x: n.toCharArray()){
            if(x == tar){
                a++;
            }
        }

        if(a == 0){
            System.out.println("-4");
        }else if(a == 1){
            System.out.println("-2");
        }else if(a == 2){
            System.out.println("0");
        }else if(a == 3){
            System.out.println("2");
        }else{
            System.out.println("4");
        }

    }
}
