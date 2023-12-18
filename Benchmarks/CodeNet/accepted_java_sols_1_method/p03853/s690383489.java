import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int height=scan.nextInt();
        int width=scan.nextInt();
        String[] str=new String[height];
        Queue<String> queue=new ArrayDeque<>();
        int i,j;
        for(i=0;i<height;i++){
            str[i]=scan.next();
            queue.add(str[i]);
        }
        //System.out.println(queue);
        for(i=0;i<height;i++){
            System.out.println(queue.peek());            
            System.out.println(queue.poll());
        } 
    }
}