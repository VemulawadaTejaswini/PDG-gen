import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        int count = 0;
        int min = list.get(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i).compareTo(min)==1){
                continue;
            }
            count += 1;
            min = list.get(i);
        }
        System.out.println(count);
    }
}
