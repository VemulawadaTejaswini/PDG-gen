import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();

        if(N%2==0){
            System.out.println(N);
        }
        else{
            System.out.println(N * 2);
        }
    }
}