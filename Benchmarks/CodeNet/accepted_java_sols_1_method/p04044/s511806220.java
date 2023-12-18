import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] num = str.split(" ");
        int suu = Integer.parseInt(num[0]);
        int suu2 = Integer.parseInt(num[1]);
        List<String> mozi = new ArrayList<>();
        for(int i=0;i<suu;i++){
            mozi.add(sc.next());
        }
        Collections.sort(mozi);
       mozi.forEach(System.out::print);
    }

    
} 
