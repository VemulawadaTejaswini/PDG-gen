import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
        for(int i=0;i<n-1;i++){
            int x=scan.nextInt();
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else {
                map.replace(x, map.get(x) + 1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(i+1)){
                System.out.println(map.get(i+1));
            }
            else System.out.println(0);
        }
    }
}
