import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        for(int i = 0; i < h+2; i++){
            if(i == 0 || i == h+1){
                String s = "";
                for(int j = 0; j < w+2; j++) s += "#";
                System.out.println(s);
            }else{
                String s = sc.next();
                System.out.println("#" + s + "#");
            }
        }
    }
}