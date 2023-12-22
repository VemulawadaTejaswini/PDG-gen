import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            list.add(scanner.nextInt());
        }
        if(list.stream().distinct().collect(Collectors.toList()).size() == list.size()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
