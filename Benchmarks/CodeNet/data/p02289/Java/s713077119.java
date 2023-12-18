import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        while(true){
            String command = sc.next();
            if(command.equals("end")){
                break;
            }else if(command.equals("insert")){
                priorityQueue.add(sc.nextInt());
            }else{
                System.out.println(priorityQueue.poll());
            }
        }
    }
}
