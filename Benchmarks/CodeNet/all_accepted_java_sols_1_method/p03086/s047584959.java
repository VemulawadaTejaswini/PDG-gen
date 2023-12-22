import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] list = new String[s.length()];
        int[] l = new int[s.length()+1];
        list = s.split("");
        int count =0;
        for( int i =0; i <s.length(); i++){
         if(list[i].equals("A") ||list[i].equals("G")||list[i].equals("C")||list[i].equals("T") ){
             count++;
         }else{
             l[i] = count;
             count =0;
         }

        }
        l[s.length()] = count;
        Arrays.sort(l);
        System.out.println(l[s.length()]);
    }
}