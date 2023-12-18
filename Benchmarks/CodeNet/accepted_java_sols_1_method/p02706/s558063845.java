import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        int sum = 0;
        for (int val : list) {
            sum += val;
        }
        if(n<sum){
            System.out.println("-1");
            return;
        }
        System.out.println(n - sum);
    }

}