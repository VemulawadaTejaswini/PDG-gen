import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] w = new String[4];
        w = s.split("");
        int count=0;
        for(int i =0;i < 4;i++){
            for(int k=i+1;k < 4; k++ )
            if(w[i].equals(w[k])){
                count++;
            }

        }
        if(count == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

