import java.util.*;
import java.io.*;
import static java.util.Comparator.*;
 
class Main{
    public static void main(String[] args){
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       in.lines().map(Integer::new).sorted(reverseOrder()).limit(3).forEach(System.out::println);
    }
}