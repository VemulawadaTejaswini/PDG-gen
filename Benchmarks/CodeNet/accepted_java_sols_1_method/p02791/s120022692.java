

import java.util.*;

class Main {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        Integer n= s.nextInt();
        long min=Long.MAX_VALUE;
        int count=0;
        for (int i = 1; i <=n ; i++) {
            Integer p= s.nextInt();
            if(p<=min){
                count++;
            }
            min=Math.min(p,min);
        }
        System.out.println(count);




    }
}