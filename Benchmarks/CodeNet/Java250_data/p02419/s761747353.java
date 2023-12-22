import java.util.Scanner;

public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String W = sc.next();
        W = W.toLowerCase();
        String T[] = new String[10000];
        int count = 0;
        for(int i=0; i<10000; i++){
            T[i] = sc.next();
            if(T[i].equals("END_OF_TEXT")) break;
            T[i] = T[i].toLowerCase();
            if(T[i].equals(W)) count++;
        } 
        System.out.println(count);
    }
}
