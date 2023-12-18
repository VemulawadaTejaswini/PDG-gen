import java.util.*;

public class Main{	

public static void main(String[] args) {
	Queue<String> name = new LinkedList<String>();
	Queue<Integer> time = new LinkedList<Integer>();
	
	Scanner in = new Scanner(System.in);
	
	int elems = in.nextInt();
	int timer = in.nextInt();
	int timePassed = 0;
	in.nextLine();
	
	String eName = "";
	int eTime = 0;
	
	for (int i = 0; i < elems; i++) {
		eName = in.next();
		name.add(eName);
		eTime = in.nextInt();
		time.add(eTime);
	}
	
	while(!name.isEmpty()) {
		String str = name.poll();
		int remainingTime = time.poll();
		if (remainingTime <= timer) {
			timePassed += remainingTime;
			System.out.println(str + " " + timePassed);
		}
		else {
			remainingTime -= timer;
			name.add(str);
			time.add(remainingTime);
			timePassed += timer;
		}
	}
}
}
