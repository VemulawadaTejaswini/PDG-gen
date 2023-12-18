import java.awt.Point;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AOJ1021 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new InputStreamReader(System.in));

		ArrayList<StringBuilder> lines = new ArrayList<StringBuilder>();
		while (true) {
			String text = sc.next();
			if (text.equals("END_OF_TEXT"))
				break;
			lines.add(new StringBuilder(text));
		}
		Point cursor = new Point();

		String buffer = null;

		commandLoop: while (true) {
			char command = sc.next().charAt(0);
			StringBuilder currentLine = lines.get(cursor.y);
			switch (command) {
			case 'a':
				cursor.x = 0;
				break;
			case 'e':
				cursor.x = currentLine.length();
				break;
			case 'p':
				if (cursor.y > 0)
					cursor.y--;
				else
					cursor.x = 0;
				break;
			case 'n':
				if (cursor.y + 1 < lines.size())
					cursor.y++;
				cursor.x = 0; // ?
				break;
			case 'f':
				if (cursor.x < currentLine.length()) {
					cursor.x++;
				}
				else if (cursor.y + 1 < lines.size()) {
					cursor.y++;
					cursor.x = 0;
				}
				break;
			case 'b':
				if (cursor.x > 0) {
					cursor.x--;
					break;
				}
				else if (cursor.y > 0) {
					cursor.y--;
					cursor.x = 0;
				}
				break;
			case 'd':
				if (cursor.x < currentLine.length()) {
					currentLine.deleteCharAt(cursor.x);
				}
				else if (cursor.y + 1 < lines.size()) {
					currentLine.append(lines.remove(cursor.y + 1));
				}
				break;
			case 'k':
				if (cursor.x == currentLine.length()) {
					if (cursor.y + 1 < lines.size()) {
						currentLine.append(lines.remove(cursor.y + 1));
						buffer = "\n";
					}
				}
				else {
					buffer = currentLine.substring(cursor.x);
					currentLine.delete(cursor.x, currentLine.length());
				}
				break;
			case 'y':
				if (buffer != null) {
					if (buffer.equals("\n")) {
						StringBuilder newLine = new StringBuilder();
						if(cursor.x != currentLine.length()) {
							newLine.append(currentLine.substring(cursor.x));
							currentLine.delete(cursor.x, currentLine.length());
							
						}
						lines.add(cursor.y, newLine);
						cursor.y++;
						cursor.x = 0;
					}
					else {
						if(cursor.x == currentLine.length())
							currentLine.append(buffer);
						else
							currentLine.insert(cursor.x, buffer);
						cursor.x += buffer.length();
					}
				}
				break;

			default:
				break commandLoop;
			}
//			System.out.println(cursor);
//			System.out.println(currentLine);
		}
		for (StringBuilder sb : lines) {
			System.out.println(sb);
		}
	}

}