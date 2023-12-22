import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		final LinkedList<Process> processes = getProcesses();
		final String result = runProcessing(processes);
		
		System.out.print(result);
	}
	
	private static int quantum;
	public static String runProcessing(final LinkedList<Process> processes) {
		final StringBuilder result = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		
		Process process;
		int elapsed = 0;
		while ((process = processes.poll()) != null) {
			if (quantum < process.processingTime) {
				elapsed += quantum;
				process.processingTime -= quantum;
				processes.add(process);
				
			} else {
				elapsed += process.processingTime;
				result.append(process.name).append(" ").append(elapsed).append(lb);
			}
		}
		
		return result.toString();
	}
	
	public static LinkedList<Process> getProcesses() throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String[] requirement = reader.readLine().split(" ");

		final int numberOfPprocess = Integer.parseInt(requirement[0]);
		quantum = Integer.parseInt(requirement[1]);
		
		final LinkedList<Process> processes = new LinkedList<Process>();
		for (int i = 0; i < numberOfPprocess; i++) {
			final String[] line = reader.readLine().split(" ");
			processes.add(new Process(line[0], Integer.parseInt(line[1])));
		}

		return processes;
	}
}

class Process {
	String name;
	int processingTime;

	public Process(String name, int processingTime) {
		this.name = name;
		this.processingTime = processingTime;
	}
}