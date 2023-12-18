import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	0 <= cursor <= text.length()
*/

//public class Problem1101_ASimpleOfflineTextEditor {
public class Main {
	
	private String text;
	private int cursor;
	
	public static void main(String[] args) {
		try {
		//	Problem1101_ASimpleOfflineTextEditor test = new Problem1101_ASimpleOfflineTextEditor();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int caseCount = Integer.parseInt(reader.readLine());
			int caseNumber = 0;
			for(int i = 0; i < caseCount; i++) {
				
				test.initialize(reader.readLine());
				int editCount = Integer.parseInt(reader.readLine());
				for(int j = 0; j < editCount; j++) {
					test.doCommand(reader.readLine());
				}
				test.showAnswer();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void initialize(String line) {
		setText(line);
		cursor = 0;
	//	System.out.println("ツ渉可甘コツ可サ:cursor:" + cursor + "\t" + text);
	}
	void doCommand(String command) {
		if(command.startsWith("forward c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			forwardChar();
		} else if(command.startsWith("forward w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			forwardWord();
		} else if(command.startsWith("backward c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			backwardChar();
		} else if(command.startsWith("backward w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			backwardWord();
		} else if(command.startsWith("insert")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			insert(command.substring(8, command.length()-1));
		} else if(command.startsWith("delete c")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			deleteChar();
		} else if(command.startsWith("delete w")) {
	//		System.out.println("ツコツマツδ督ド:" + command);
			deleteWord();
		} else {
	//		System.out.println("**ツコツマツδ督ドツエツδ可ー:" + command);
		}
	//	System.out.println("text:\t" + text + "\tcursor: " + cursor);
	//	showAnswer();
	}
	private void forwardChar() {
		if(cursor < text.length()) {
	//		System.out.println("ツ北ツ北");
			cursor++;
		}
	}
	private void forwardWord() {
		if(cursor == text.length() || text.length() == 0) {
			return;
		}
	//	cursor++;
		while(text.charAt(cursor) == ' ') {
			cursor++;
			if(cursor == text.length()) {
				return;
			}
		}
		for(int i = cursor; i < text.length(); i++) {
			char targetChar = text.charAt(i);
			if(targetChar == ' ') {
			/*	while(text.charAt(i+1) == ' ') {
					i++;
				}
			*/	
				cursor = i;
				return;
			} else {
				//do more
			}
		}
		cursor = text.length();
	}
	private void backwardChar() {
		if(0 < cursor) {
			cursor--;
		}
	}
	private void backwardWord() {
		if(cursor < 1) {
			cursor = 0;
			return;
		}
	//	cursor--;
		while(text.charAt(cursor-1) == ' ') {
			cursor--;
			if(cursor == 0) {
				return;
			}
		}
		for(int i = cursor; i > 0; i--) {	//ツ催渉可づ個閉カツ篠堋つェツ凝ウツ板陳つセツづつスツ湘ェツ債づ可妥篠可楪つキツづゥツつスツづ淞０ツづ慊づ確ツ認ツつキツづゥ
			char targetChar = text.charAt(i-1);
			if(targetChar == ' ') {
				cursor = i;
				return;
			} else {
				//do more
			}
		}
		cursor = 0;
	}
	private void insert(String txt) {
		StringBuilder builder = new StringBuilder(text.substring(0, cursor));
		builder.append(txt);
		builder.append(text.substring(cursor));
		
		setText(builder.toString());
		cursor += txt.length();
	}
	private void deleteChar() {
		if(text.length() == cursor) {	//cursor == text.length()-1 ツづ按づァツ催古」ツ氾カツづ可つ
			return;
		} else if(cursor == text.length()-1) {
			setText(text.substring(0,text.length()-1));
			return;
		}
		StringBuilder builder = new StringBuilder(text.substring(0, cursor));
		builder.append(text.substring(cursor+1));
		
		setText(builder.toString());
	}
	private void deleteWord() {
		if(text.length() == cursor) {	//cursor == text.length() ÈçÅãöÉ éÌÅ½àµÈ¢B
			return;
		} else if(cursor == text.length()-1) {
			setText(text.substring(0,text.length()-1));
			return;
		}
		int start = cursor;
	//	moveToEndOfWord();
		forwardWord();
		
		StringBuilder builder = new StringBuilder(text.substring(0, start));
		builder.append(text.substring(cursor));
		
		setText(builder.toString());
		cursor = start;
	}
	private void moveToEndOfWord() {
		if(cursor == text.length()-1) {
			return;
		}
		while(text.charAt(cursor) == ' ') {
			cursor++;
		}
		for(int i = cursor; i < text.length(); i++) {
			char targetChar = text.charAt(i);
			if(targetChar == ' ') {
				cursor = i-1;
				return;
			} else {
				//do more
			}
		}
		cursor = text.length()-1;
	}
	private void setText(String txt) {
		text = txt;
	}
	void showAnswer() {
	//	System.out.println("text:\t" + text + "\tcursor: " + cursor);
		
		StringBuilder resultBuilder;
		if(cursor == text.length()) {
			resultBuilder = new StringBuilder(text);
			resultBuilder.append("^");
		} else {
			resultBuilder = new StringBuilder(text.substring(0, cursor));
			resultBuilder.append("^");
			resultBuilder.append(text.substring(cursor));
		}
		System.out.println(resultBuilder.toString());
	}
}