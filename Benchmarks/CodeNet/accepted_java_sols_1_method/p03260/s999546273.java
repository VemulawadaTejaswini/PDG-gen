import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        List<Integer> list = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();
        if(a*b % 2 == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
	}
}