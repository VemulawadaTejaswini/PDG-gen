import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            int d = scanner.nextInt();
            for(int j=0; j<d; j++){
                map.put(scanner.nextInt(), 0);
            }
        }
        scanner.close();
        System.out.print(n-map.size());
    }
 
}