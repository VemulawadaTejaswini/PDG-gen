import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i,k;
        k = 0;
        String W = scan.next();
        String[] T;
            for(i = 1;i<=1000;i++){
                T_i = scan.next();
                if(T_i == W){
                    k++;
                }
                if(T_i == "END_OF_TEXT"){
                    break;
                }
            }
            System.out.println(k);
    }
}