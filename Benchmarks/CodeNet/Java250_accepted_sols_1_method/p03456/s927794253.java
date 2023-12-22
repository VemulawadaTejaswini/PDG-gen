import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A =scanner.next();
        String B =scanner.next();

        Long t = Long.parseLong(A+B);


        HashSet<Long> hashSet = new HashSet<>();
        for(int i=1; i<1000; i++){
            hashSet.add((long)i * (long)i);
        }

        if(hashSet.contains(t)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
