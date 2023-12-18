
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static int END_VALUE = Integer.MIN_VALUE;
	public static int DEL_VALUE = Integer.MIN_VALUE+1;
	public static int EMPTY_VALUE = Integer.MIN_VALUE+2;
	public static int MIN_VALUE = -1000000000;
	public static int MAX_VALUE =  1000000000;

	public static int MIN_COMMAND = 1;
	public static int MAX_COMMAND = 500000;

	public static void main(String[] args) throws Exception {
		doCommnand(initCommand());
	}

	private static ArrayElement END = new ArrayEnd();

	private static void doCommnand(String[][] commandList) {
		ArrayElement cursor = END; 

		int sumDistance = 0;
		for (String[] commandInfo : commandList) {
			String command = commandInfo[0];
			// insert x
			if (command.equals("0")) {
				int value = Integer.parseInt(commandInfo[1]);
				cursor = cursor.insert(value);
				// move d
			} else if (command.equals("1")) {
				int value = Integer.parseInt(commandInfo[1]);
				int distance;
				if (value < 0) {
					distance = -value;
				} else {
					distance = value;
				}
				sumDistance += distance;
				if (sumDistance > 1000000) {
					throw new IllegalArgumentException("command is illegal");
				}
				cursor = cursor.move(value);
				// erase
			} else if (command.equals("2")) {
				if (cursor !=  null) {
					cursor = cursor.delete();
				}
			}
			//scanAndDump(cursor, ",");
			//System.out.println("");
		}
		scanAndDump(cursor, "\n");
	}
	private static void scanAndDump(ArrayElement element, String delimitor) {
		if (element.isEnd()) {
			return;
		}

		ArrayElement scanElement = element;
		while(true) {
			if (scanElement.previous == null) {
				break;
			}
			scanElement = scanElement.previous;
		}

		ArrayElement printElement =  scanElement;
	
		StringBuilder builder = new StringBuilder();
		while(true) {
			builder.append(printElement.value);
			builder.append(delimitor);
			if (printElement.next.isEnd()) {
				break;
			}
			printElement = printElement.next;
		}
		System.out.print(builder.toString());
	}

	public static class ArrayElement {

		private ArrayElement previous;

		private ArrayElement next;

		int value;
		
		boolean isEnd() {
			return false;
		}

		public ArrayElement(int value) {
			validateValue(value);
			this.value = value;
		}

		public ArrayElement insert(int value) {
			validateValue(value);
			ArrayElement newElement = new ArrayElement(value);
			newElement.previous = previous;
			newElement.next = this;
			if (previous != null) {
				previous.next = newElement;
			}
			previous = newElement;
			return newElement;
		}

		public ArrayElement delete() {
			if (previous != null) {
				previous.next = next;
			}
			if (next != null) {
				next.previous = previous;
			}
			return next;
		}

		public ArrayElement move(int x) {
			int direction = 0;
			int distance = 0;
			if (x > 0) {
				direction = 1;
				distance = x;
			} else if (x < 0) {
				direction = -1;
				distance = -x;
			}
			ArrayElement element = this;
			for (int i=0; i<distance; i++) {
				if (direction == 1) {
					element = element.next;
				} else if (direction == -1) {
					element = element.previous;
				}
				if (element.isEnd()) {
					return END;
				}
			}
			return element;
		}
		private void validateValue(int value) {
			if (value < MIN_VALUE || value > MAX_VALUE) {
				throw new IllegalArgumentException("command is illegal");
			}
		}
	}
	
	public static class ArrayEnd extends ArrayElement {
		
		public ArrayEnd() {
			super(0);
		}
		
		public boolean isEnd() {
			return true;
		}
	}
	
	private static String[][] initCommand() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numCommandStr = br.readLine();
		int commandNum = Integer.parseInt(numCommandStr);
		if (commandNum < MIN_COMMAND || commandNum > MAX_COMMAND) {
			throw new IllegalArgumentException(MIN_COMMAND + " <= commandNum <= " + MAX_COMMAND);
		}
		String[][] commandList = new String[commandNum][];
		for (int i=0; i< commandNum; i++) {
			String line = br.readLine();
			if (line == null || line.isEmpty()) {
				throw new IllegalArgumentException("command is empty");
			}
			commandList[i] = line.split(" ", -1);
		}
		return commandList;
	}
}

