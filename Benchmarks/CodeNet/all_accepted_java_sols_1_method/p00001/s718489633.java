import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       in.lines().map(Integer::valueOf).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}