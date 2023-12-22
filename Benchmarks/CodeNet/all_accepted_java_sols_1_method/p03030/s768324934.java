import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++){
            StringBuffer tmp = new StringBuffer();
            tmp.append(String.format("%-10s",sc.next()));
            tmp.append(String.format("%4s",String.valueOf(Integer.parseInt(sc.next()) - 100)));
            map.put(tmp.toString(),i + 1);
        }
        for(Integer num: map.values()){
            System.out.println(num);
        }
    }
}