import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        for(int i=1; i<=1000000000; i++){
            if(X*2>Y){
                System.out.println(i);
                break;
            }
            X *= 2;
        }
    }
}