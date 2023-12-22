import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int d = 0;
        ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>(N);
        
        for(int i = 0;i < N;i++) {
            arraylist.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < (2 * K); i++){
            if(i % 2 == 0){
                d = scanner.nextInt();
            }else{
                for(int s = 0; s < d; s++){
                    arraylist.get(scanner.nextInt() - 1).add(i);
                }
            }
        }
        
        int count = 0;
        for(int i = 0;i < N;i++) {
            if(arraylist.get(i).size() == 0) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}