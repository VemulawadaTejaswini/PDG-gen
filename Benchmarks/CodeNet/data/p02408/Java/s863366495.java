import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        String[] array = {"S ", "H ", "C ", "D "};

        for(String a: array){
            for(int i=1; i<=13; i++){
                list.add(String.format("%s%d", a, i));
            }
        }

        System.out.println(array);

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            String line = sc.next();
            String line2 = sc.next();

            line = line + " " + line2;

            if(list.contains(line)){
                list.remove(list.indexOf(line));
            }
        }

        list.forEach(System.out::println);
    }
}

