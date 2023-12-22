import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> Vlist = new ArrayList<>();
        List<Integer> Clist = new ArrayList<>();

        for(int i=0; i<N; i++){
            Vlist.add(scanner.nextInt());
        }
        for(int i=0; i<N; i++){
            Clist.add(scanner.nextInt());
        }

        int maxVal = 0;
        for(int i=0; i<N; i++){
            if (Vlist.get(i) - Clist.get(i) >0){
                maxVal = maxVal + Vlist.get(i) - Clist.get(i);
            }
        }

        System.out.println(maxVal);
    }
}