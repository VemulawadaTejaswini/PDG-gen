import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hashmap = new HashMap<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            hashmap.put(sc.next(),1);
        }
        if (hashmap.size()==4){
            System.out.println("Four");
        }else {
            System.out.println("Three");
        }
    }
}
