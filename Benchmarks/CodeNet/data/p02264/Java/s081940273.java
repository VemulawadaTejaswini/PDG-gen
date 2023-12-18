import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		LinkedList<Process> processQueue = new LinkedList<Process>();

		int n = sc.nextInt();
		int quantum = sc.nextInt();
		for (int i = 0; i < n; i++) {
			processQueue.add(new Process(sc.next(), sc.nextInt()));
		}
		
		for (int spendTime = 0; !processQueue.isEmpty(); ) {
			Process run = processQueue.remove();
			if (run.pRemain > quantum) {
				run.pRemain -= quantum;
				processQueue.add(run);
				spendTime += quantum;
			} else if (run.pRemain == quantum) {
				run.pRemain -= quantum;
				spendTime += quantum;
				printProcess(run, spendTime);
			} else {
				spendTime += quantum - run.pRemain;
				run.pRemain = 0;
				printProcess(run, spendTime);
			}
		}
    	
        sc.close();
	}

	private static void printProcess(Process run, int eTime) {
		StringBuffer str = new StringBuffer();

		str.append(run.pName);
		str.append(" ");
		str.append(eTime);

		System.out.println(str);
	}
}

class Process {
	String pName;
	int pRemain;
	int eTime;
	
	Process(String name, int time) {
		pName = name;
		pRemain = time;
		eTime = 0;
	}
}