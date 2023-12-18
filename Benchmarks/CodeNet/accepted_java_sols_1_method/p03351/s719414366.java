
import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();


        if(abs(a[2]-a[0]) <=d || (abs(a[0] - a[1])<=d && abs(a[1] - a[2])<d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



        }

    }