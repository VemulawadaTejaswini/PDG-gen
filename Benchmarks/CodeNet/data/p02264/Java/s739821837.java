import java.util.ArrayList;
import java.util.Scanner;

class Process {
    String name;
    int time;
    int finishTime;

    Process(String name, int time, int finishTime) {
        this.name = name;
        this.time = time;
        this.finishTime = finishTime;
    }
}

class Main {

    int size;
    int quantum;

    public void go() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.quantum = sc.nextInt();
        ArrayList<Process> list = new ArrayList<Process>();
        ArrayList<Process> finishList = new ArrayList<Process>();
        for (int i = 0; i < this.size; i++) {
            list.add(new Process(sc.next(), sc.nextInt(), 0));
        }

        int time = 0;
        while (!list.isEmpty()) {
            Process currentProcess = list.get(0);
            // finish
            if (currentProcess.time <= this.quantum) {
                currentProcess.finishTime = time + currentProcess.time;
                finishList.add(new Process(currentProcess.name, currentProcess.time, currentProcess.finishTime));
                time += currentProcess.time;
            } else {
                currentProcess.time -= this.quantum;
                list.add(new Process(currentProcess.name, currentProcess.time, currentProcess.finishTime));
                time += this.quantum;
            }
            list.remove(0);
        }
        for (Process process : finishList) {
            System.out.println(process.name + " " + process.finishTime);
        }
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.go();
    }
}
