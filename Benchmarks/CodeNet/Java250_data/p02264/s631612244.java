import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// You cant store primitive types in queue?

public class Main{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        Scanner input1 = new Scanner(System.in);
        int length = input1.nextInt();
        int QUANTUM = input1.nextInt();
        int totalTime=0;
        int result; // This is the time of each item
        String name;

        input1.nextLine();
        // Takes all the inputs and put into the queue
        for(int i=0;i<length;i++){
            q.add(input1.nextLine());
        }

        while (q.size()!=0){
            String removed = q.remove();
            String[] removeItem = removed.split(" ");

            name =removeItem[0];
            result = Integer.valueOf(removeItem[1])-QUANTUM;
            if (result >0){
                q.add(name+" "+result);
                totalTime += QUANTUM;
            }
            else{
                totalTime += result+QUANTUM;
                System.out.println(name+" "+totalTime);
            }

        }
    }
}

