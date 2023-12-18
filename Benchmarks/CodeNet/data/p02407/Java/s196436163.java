import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> list = new LinkedList<Integer>();

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        for(int j=list.size()-1; j>=0; j--){
            if(j == 0){
                System.out.println(list.get(j));
            } else {
                System.out.print(list.get(j) + " ");
            }
        }
    }
}

