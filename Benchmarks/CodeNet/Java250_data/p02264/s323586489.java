
import java.util.*;
import java.lang.*;

class Process {
    String id;
    int time;
    Process(String x, int t) {
        id = x;
        time = t;
    }
}


public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int qtm = sc.nextInt();
        int count = 0;
        ArrayList<Process> queue = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Process(sc.next(), sc.nextInt()));
        }

        while(true) {
            if (queue.isEmpty()) {
                break;
            }
            Process element = queue.get(0);
            if (element.time > qtm) {
                element.time -= qtm;
                count += qtm;
                queue.remove(0);
                queue.add(element);
            } else {
                count += element.time;
                queue.remove(0);
                System.out.println(element.id + " " + count);
            }
        }
    }
}
