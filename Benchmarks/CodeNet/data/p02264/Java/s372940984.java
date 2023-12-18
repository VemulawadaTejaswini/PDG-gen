import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int clock = scan.nextInt();
        int time = 0;
        LinkedList<String> names = new LinkedList<>();
        LinkedList<Integer> amounts = new LinkedList<>();
        for(int x =0; x < n; x++){
            names.add(scan.next());
            amounts.add(scan.nextInt());
        }
        while(!amounts.isEmpty()){
            String name = names.removeFirst();
            int amount = amounts.removeFirst();
            if(amount <= clock){
                time = time + amount;
                System.out.println(name + " " + time);
            }
            else{
                time = time + clock;
                amount = amount - clock;
                names.add(name);
                amounts.add(amount);
            }

        }

    }
}
