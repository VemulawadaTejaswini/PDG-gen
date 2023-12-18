import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        int n = sc.nextInt();

        if(n % 10 == 3){
            System.out.println("bon");
        }else if(n % 10 == 0||n % 10 == 1||n % 10 == 6||n % 10 == 8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
        
    
	}
}