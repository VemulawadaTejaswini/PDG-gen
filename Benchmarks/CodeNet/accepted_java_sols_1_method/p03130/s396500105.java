import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer, Integer> nodeConnections = new HashMap<Integer, Integer>();
        for(int i = 0 ; i <6; ++i) {
            int temp = sc.nextInt();
            int value = 0;
            if(nodeConnections.get(temp) == null) {
                value = 1;
                nodeConnections.put(temp, value);
            }else {
                value = nodeConnections.get(temp);
                nodeConnections.put(temp, ++value);
            }
            //System.out.println(temp +" ="+value);
        }
        Set<Integer> nodes = nodeConnections.keySet();
        int conn_one = 0;
        int conn_two = 0;
        for(Integer n :nodes){
            int value = nodeConnections.get(n);
            //System.out.println(n +" ="+value);
            if(value == 1) {
                conn_one ++;
            }else if (value==2){
                conn_two ++;
            }
        }
        //System.out.println("conn_one="+conn_one +" conn_two="+conn_two);
        if(conn_one == 2 && conn_two == 2) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}
