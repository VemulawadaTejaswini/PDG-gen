import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashSet<String> hashSet = new HashSet<>();

        char past = '_';

        for(int i=0; i<N; i++){
            String S = scanner.next();
            if(i != 0){
                if(past != S.charAt(0) || hashSet.contains(S)){
                    System.out.println("No");
                    return;
                }
            }
            past = S.charAt(S.length()-1);
            hashSet.add(S);
        }

        System.out.println("Yes");

    }
}
