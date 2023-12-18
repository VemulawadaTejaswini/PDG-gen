import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int count = 0;
        for(int i = 0;i < n - 1;i++){
            if(list.get(i) <= x){
                count++;
                x -= list.get(i);
            } else {
                break;
            }
        }

        if(x == list.get(list.size()-1)){
            count++;
        }
        System.out.println(count);
    }
}