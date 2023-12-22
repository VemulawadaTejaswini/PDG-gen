import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=0;i<n;i++){
            number.add(scanner.nextInt());
        }
        int count = 1;
        int instance = 0;
        int max = 0;
        Collections.sort(number);
        boolean b = true;
        for (int i=1;i<number.size();i++){
            if (!number.get(i).equals(number.get(i - 1))){
                b = true;
            }else {
                b = !b;
            }
            if (b){
                count++;
            }else {
                count--;
            }
        }
        System.out.println(count);

    }

}