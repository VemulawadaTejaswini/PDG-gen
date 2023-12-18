import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while (sc.hasNext()){
            list.add(sc.nextInt());
        }
        for (int i = n - 1; i > 0; i--){
            System.out.print(list.get(i)+" ");
            System.out.flush();
        }
        System.out.println(list.get(0));
    }
}