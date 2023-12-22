import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < q; i++){
            int op = sc.nextInt();

            if(op == 0){
                int or = sc.nextInt();
                list.add(or);
            }else if(op == 1){
                int or = sc.nextInt();
                System.out.println(list.get(or));
            }else{
                list.remove(list.size() - 1);
            }
        }
    }
}

