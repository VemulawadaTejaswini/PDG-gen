import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Integer> queue = new ArrayList<Integer>(200000);
        for(int i = 0; i < n; i++){
            int command = sc.nextInt();
            switch(command){
                case 0:
                    queue.add(sc.nextInt());
                    break;
                case 1:
                    System.out.println(queue.get(sc.nextInt()));
                    break;
                case 2:
                    queue.remove(queue.size() - 1);
            }
            
        }
    }
}

