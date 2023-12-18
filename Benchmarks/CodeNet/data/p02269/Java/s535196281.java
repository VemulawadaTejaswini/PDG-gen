import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Main {
	static final String INSERT = "insert";
	static final String FIND  = "find";	
	
	static Map<String, Boolean> dictMap = new HashMap<>(1000000);
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			String command = scanner.next();
			if (command.equals(INSERT)) {
				insert(scanner.next());
			}else if (command.equals(FIND)) {
				System.out.println(find(scanner.next()));
			}
		}
	}
	
	static void insert(String string){
		dictMap.put(string, true);
	}

	static String find(String string){
		if(dictMap.get(string) != null)
			return "yes";
		return "no";
	}
}