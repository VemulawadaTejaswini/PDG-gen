
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int kosu = sc.nextInt();
        int hen [] = new int [3];

        for(int j=0; j<kosu; j++ ){
            for(int k=0; k<3; k++){
                int len = sc.nextInt();
                 hen[k] = len*len;
            }
             Arrays.sort(hen);
            
            if((hen[0] + hen[1]) == hen[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }

    }
    
    }