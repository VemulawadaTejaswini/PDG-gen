import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i).compareTo(list.get(i+1))==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
}