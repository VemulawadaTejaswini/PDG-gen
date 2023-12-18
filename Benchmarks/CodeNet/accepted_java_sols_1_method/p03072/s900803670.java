import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        boolean tall = false;
        for (int i = 0; i < a; i++) {
            list.add(Integer.parseInt(scan.next()));
        }
        for (int i = 1; i < a; i++) {
            for(int h = 0;h<i;h++){
                if(list.get(i)>=list.get(h)){
                    tall = true;
                }else{
                    tall = false;
                }
                if(!tall){
                    break;
                }
            }
            if(tall){
                count += 1;
            }
        }
        count += 1;
        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        scan.close();
    }
}