
import java.util.Scanner;

public class Main {
	
	public static int size = 5;
	public static int interval = 100;
	
	public static int head=0, tail=0;
	
	public static boolean isFull() {
		return (tail-head >= size) ? true : false;
	}
	
	public static boolean isEmpty() {
		return (tail-head <=0 ) ? true : false;
	}

	public static void enqueue(Item[] queue, Item x) throws Exception {
		if (isFull()) 
			throw new Exception("Error: The queue is full!");
		queue[tail%size] = x;
		tail ++;
	}
	
	public static Item dequeue(Item[] queue) throws Exception {
		if (isEmpty())
			throw new Exception("Error: The queue is empty");
		Item headItem = queue[head%size];
		queue[head%size] = null;
		head ++;
		return headItem;
	}
	
	public static int process(Item i, int interval) {
		int time = i.getTime();
		if (time<=interval) {
			i.setTime(0);
			return time;
		} else {
			i.setTime(time-interval);
			return interval;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		interval = sc.nextInt();
		Item[] queue = new Item[size];
		
		int atime = 0;
		
		try {
			for (int i=0; i<size; i++) {
				enqueue(queue, new Item(sc.next(), sc.nextInt()));
			}
			sc.close();
			
			while (!isEmpty()) {
				Item item = dequeue(queue);
				atime += process(item, interval);
				if (item.getTime() == 0) {
					System.out.println(item.getName() + " " + atime);
				} else {
					enqueue(queue, item);
				}
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Item {
	private String name;
	private int time;
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Item(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}
	
}
