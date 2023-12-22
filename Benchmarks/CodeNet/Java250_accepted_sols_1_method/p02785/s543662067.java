import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.nextLong());
        }
        scanner.close();
        Collections.sort(list);
        long sum = 0;
        for(int i=list.size()-1; i>=0; i--){
            if(i>list.size()-1-k){
                continue;
            }
            sum += list.get(i);
        }
        System.out.println(sum);
    }
    
}