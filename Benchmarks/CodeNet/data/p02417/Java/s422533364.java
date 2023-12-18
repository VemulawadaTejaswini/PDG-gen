
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String , Integer> map = new  HashMap<String, Integer>();
        map.put("a",0);
        map.put("b",0);
        map.put("c",0);
        map.put("d",0);
        map.put("e",0);
        map.put("f",0);
        map.put("g",0);
        map.put("h",0);
        map.put("i",0);
        map.put("j",0);
        map.put("k",0);
        map.put("l",0);
        map.put("m",0);
        map.put("n",0);
        map.put("o",0);
        map.put("p",0);
        map.put("q",0);
        map.put("r",0);
        map.put("s",0);
        map.put("t",0);
        map.put("u",0);
        map.put("v",0);
        map.put("w",0);
        map.put("x",0);
        map.put("y",0);
        map.put("z",0);
        while(sc.hasNext()){
            String s = sc.nextLine().toLowerCase();
            for(int i = 0;i<s.length();i++){
                String let = s.substring(i, i + 1);
                Optional<Integer>  val = Optional.ofNullable(map.get(let));
                if(val.isPresent()){
                    int val2 = val.get();
                    val2 = val2 + 1;
                    map.replace(let,val2);
                }
            }
        }
            for(String key : map.keySet()){    
            System.out.println(key + " : " + map.get(key));
        }
    }
}


