import java.io.*;
import java.util.*;

class Process {
   private String name;
   private int time;
  
   public Process(String name, int time) {
       this.name = name;
       this.time = time;
   }
  
   public int getTime() {
       return time;
   }

   public void setTime(int time) {
       this.time = time;
   }

   public String getName() {
       return name;
   }
  
  
}
public class Main {

   public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       int inputProcesses = in.nextInt();
       int quantum = in.nextInt();

       Queue<Process> processes = new LinkedList<Process>();

       for (int i = 0; i < inputProcesses; i++) {
           String nameIndex = in.next();
           int timeIndex = in.nextInt();
          
           Process processIndex = new Process(nameIndex, timeIndex);
           processes.add(processIndex);
       }
       int currTime = 0;
       while(!processes.isEmpty()) {
           Process head = processes.poll();
           if (head.getTime() > quantum) {
          	   head.setTime(head.getTime() - quantum);
               currTime += quantum;
               processes.add(head);
           }
           else {
               currTime += head.getTime();
               System.out.println(head.getName() + " " + currTime);
           }
       }
   }
}
