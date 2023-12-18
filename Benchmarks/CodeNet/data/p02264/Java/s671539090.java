import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<String[]> tasks = new LinkedList<String[]>(), finished = new LinkedList<String[]>();
		Scanner sc = new Scanner(System.in);
		String[] l1 = sc.nextLine().split(" ");
		int quantum = Integer.valueOf(l1[1]), eclipsedTime=0;
		for (int i = 0; i < Integer.valueOf(l1[0]); i++) {
			String[] line = sc.nextLine().split(" ");
			tasks.add(new String[]{line[0],line[1]});
		}
		while(tasks.size()>0) {
			String[] currentTask = tasks.poll();
			if(Integer.valueOf(currentTask[1])<=quantum) { 
				int partialTime = Integer.valueOf(currentTask[1]);
				finished.add(new String[] {currentTask[0],Integer.toString(partialTime+eclipsedTime)});
				eclipsedTime+=partialTime;
			}
			else {
				currentTask[1]=Integer.toString(Integer.valueOf(currentTask[1])-quantum);
				tasks.add(currentTask);
				eclipsedTime+=quantum;
			}

		}
		for(String[] task: finished) {
			System.out.println(task[0]+" "+task[1]);
		}
	}

}

