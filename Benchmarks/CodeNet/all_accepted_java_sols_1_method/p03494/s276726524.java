import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0;i<n;i++){
            A.add(scanner.nextInt());
        }
        boolean b = true;
        int count=0;
        while (b){
            for (int i:A){
                if (i%2==1){
                    b = false;
                    break;
                }
            }
            if (!b){
                break;
            }
            ArrayList<Integer> B = new ArrayList<>();
            count++;
            for (int i=0;i<A.size();i++){
                B.add(A.get(i)/2);
            }
            A.clear();
            A.addAll(B);
        }
        System.out.println(count);
    }

}