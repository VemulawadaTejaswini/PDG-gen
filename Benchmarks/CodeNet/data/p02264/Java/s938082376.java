//package javaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 2017/6/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        LoopQueue<Process> queue = new LoopQueue<>();
        for(int i = 0; i < n; i++){
            queue.enqueue(new Process(scanner.next(),scanner.nextInt()));
        }
        int time = 0;
        while(!queue.isEmpty()){
            Process p = queue.dequeue();
            if(p.getTime() <= q) {
                time += p.getTime();
                p.setTime(0);
                System.out.println(p.getName()+" "+time);
            } else {
                p.setTime(p.getTime() - q);
                time += q;
                queue.enqueue(p);
            }
        }
    }


}
class Process{
    String name;
    int time;
    public Process(String name,int time){
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

class LoopQueue<T>{
    private int DEFAULT_SIZE = 100001;
    private int capacity;
    private Object[] elmentData;
    private int head = 0;
    private int tail = 0;

    public  LoopQueue(){
        capacity = DEFAULT_SIZE;
        elmentData = new Object[capacity];
    }
    public LoopQueue(T element){
        this();
        elmentData[0] = element;
        tail++;
    }
    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isFull(){
        return head == (tail+1)%DEFAULT_SIZE;
    }



    public T dequeue(){
        if(isEmpty())
            throw new IndexOutOfBoundsException();
        T old = (T)elmentData[head];
        elmentData[head] = null;
        head = (head+1)%DEFAULT_SIZE;
        return old;
    }

    public void enqueue(T t){
        if(isFull())
            System.out.println("queue is full!");
        elmentData[tail] = t;
        tail = (tail+1)%DEFAULT_SIZE;

    }


}