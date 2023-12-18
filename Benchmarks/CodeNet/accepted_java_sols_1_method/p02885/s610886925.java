import java.util.*;
import java.io.*;
class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt(), b = sc.nextInt();
                int diff = a - b * 2;
                if(diff<=0){
                        System.out.println(0);
                }else{
                        System.out.println(diff);
                }
        }
}
