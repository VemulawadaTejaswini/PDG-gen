import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
	String name;
	int time;
	static int totalTime = 0;


	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String line = in.nextLine(); 
		String[] words = line.split(" ");
		Problem currentItem;
		Queue<Problem> myQueue = new LinkedList<Problem>();
		int pro = Integer.parseInt(words[0]);
		int Required = Integer.parseInt(words[1]);

		for(int i = 0; i < pro; i++) {
			line = in.nextLine(); 
			words = line.split(" ");
			myQueue.offer(new Problem(words[0], Integer.parseInt(words[1])));
			//System.out.println("added to queue: " + words[0]);
		}
		in.close();


		//System.out.println("StartQueue");
		while(!myQueue.isEmpty()) {
			//System.out.println("Queue Not Empty");
			if(((Problem) myQueue.peek()).time > 0){
				//System.out.println("IF1");
				if(((Problem) myQueue.peek()).time > Required){
					//System.out.println("IF2");
					currentItem = ((Problem) myQueue.peek()); 
					myQueue.remove();
					currentItem.time -= Required;
					totalTime += Required;
					myQueue.offer(currentItem);
				}else {
					currentItem = ((Problem) myQueue.peek()); 
					myQueue.remove();
					totalTime += currentItem.time;
					System.out.println(currentItem.name + " " + totalTime);
				}
			}else {
				System.out.println(((Problem) myQueue.peek()).name + " " + totalTime);
				myQueue.remove();

			}
		}


	}
}
	class Problem {
	String name;
	int time;
	public Problem(String name, int time){
		this.name = name;
		this.time = time;
	}
	}
