import java.util.Scanner;

class Task{
    String name;
    int time;
}

public class Main {

    static final int len = 100005;
    static Task[] num = new Task[len];

    static int head = 0;
    static int tail = 0;

    // ??????????????????????????????
    public static void enqueue(Task task){
        num[tail] = task;
        tail = (tail+1) % len;
    }

    // ??????????????????????????????
    public static Task dequeue(){
        Task temp = num[head];
        head = (head+1) % len;
        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        for (int i=0; i<n; i++){
            Task temp = new Task();
            temp.name = sc.next();
            temp.time = sc.nextInt();
            enqueue(temp);
        }

        tail = n;

        int sum = 0;

        //????????????????????¶????????¬??????????????????
        while (head != tail){
            Task temp = dequeue();
            if (temp.time <= q){
                sum += temp.time;
                System.out.println(temp.name + " " + sum);
            }
            else {
                temp.time -= q;
                enqueue(temp);
                sum += q;
            }
        }
    }

}