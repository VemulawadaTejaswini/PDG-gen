import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < a; i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>(list);
        Collections.sort(list1);
        int max = list1.get(a - 1);
        int second = list1.get(a - 2);
        for(int i = 0; i < a; i++){
            if(list.get(i) == max){
                System.out.println(second);
            }else{
                System.out.println(max);
            }
        }
    }
}
