import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String answer = ":(";
        ArrayList <Integer> b = new ArrayList<>();
        for(int i = 0;i<6;i++){
            b.add(scan.nextInt());
        }
        int c = b.get(5);
        b.remove(   5);
        if(b.get(4)-b.get(0) <= c){
            answer = "Yay!";
        }else{
            answer = ":(";
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(answer);
        out.flush();
        scan.close();
    }
}