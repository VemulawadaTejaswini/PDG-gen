import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] split = S.split("");

        int count = 0;
        String moji = "";

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                if(split[i].equals(split[j])){
                    count++;
                }
            
            }
        }

        if(count == 8){
            System.out.println("Yes");    
        }
        else{
            System.out.println("No");
        }
        
    }


}