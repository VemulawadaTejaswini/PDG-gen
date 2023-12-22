import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=1; i<=n; i++){
            map.put(i,0);
        }
        for(int val: list){
            map.put(val,map.get(val)+1);
        }
        for(int key: map.keySet()){
            System.out.println(map.get(key));
        }
    }
 
}