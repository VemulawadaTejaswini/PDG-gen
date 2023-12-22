import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       Map<String,Integer>map=new HashMap<>();
       map.put("SUN",1);
       map.put("MON",2);
       map.put("TUE",3);
       map.put("WED",4);
       map.put("THU",5);
       map.put("FRI",6);
       map.put("SAT",7);
     String ss=s.nextLine();

        System.out.println(8-map.get(ss));
        }
    }
