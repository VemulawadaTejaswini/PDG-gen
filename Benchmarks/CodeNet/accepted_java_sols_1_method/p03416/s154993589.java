import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int counter = 0;

        for(int i = A; i <= B; i++){
            String str = String.valueOf(i);
            StringBuffer rstr = new StringBuffer(str);
            rstr.reverse();

            if(str.equals(rstr.toString())){
                counter++;
            }
        }


        System.out.println(counter);
    }
}