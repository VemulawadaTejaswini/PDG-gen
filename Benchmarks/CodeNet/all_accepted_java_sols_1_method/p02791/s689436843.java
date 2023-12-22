import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i=0;i<n;i++){
            p.add(scanner.nextInt());
        }
        int count = 0;
        int min = Collections.max(p);
        for (int i=0;i<n;i++){
            if (p.get(i)<=min){
                min = p.get(i);
                count++;
            }
        }

        System.out.println(count);
    }

}