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
        
        int number = sc.nextInt();
        int k = sc.nextInt(); 
        for(int i = 0; i < number ; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int min = number - k;
        long count = 0;
        if( min <= 0 ){
            System.out.println(count);
        }else{
            for(int i = 0; i<min; i++){
                count += list.get(i);
            }
            System.out.println(count);
        }
    
	}
}