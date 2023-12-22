import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int d = scan.nextInt();
            if(!list.contains(d)) list.add(d);
        }
        System.out.println(list.size());
        scan.close();
        
    }
}