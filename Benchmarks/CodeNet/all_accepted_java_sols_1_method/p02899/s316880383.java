import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= a; i++){
            hm.put(sc.nextInt(), i);
        }
        for(int i = 1; i <= a; i++){
            list.add(hm.get(i));
        }
        for(int i = 0; i < a; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}