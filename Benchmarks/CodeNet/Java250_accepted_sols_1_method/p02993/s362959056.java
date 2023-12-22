import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] a = new String[4];
        a = n.split("");
        int count =0;
        for(int i= 0; i< 3 ; i++){
            if(!(a[i].equals(a[i+1]))){
                count++;
                if(count ==3){
                    System.out.println("Good");
                }else{
                    continue;}
            }else{
                System.out.println("Bad");
                break;
            }
        }
    }

        }
