import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String name = sc.next();
			char type   = sc.next().charAt(0);
			StringBuilder sb = new StringBuilder();
			if(type == 'X') break;
			else if(type == 'U') {
				sb.append(Character.toUpperCase(name.charAt(0)));
				for(int i = 1; i < name.length(); i++) {
					if(name.charAt(i) == '_') {
						sb.append(Character.toUpperCase(name.charAt(i+1)));
						i++;
					}
					else {
						sb.append(name.charAt(i));
					}
				}
			}
			else if(type == 'L') {
				sb.append(Character.toLowerCase(name.charAt(0)));
				for(int i = 1; i < name.length(); i++) {
					if(name.charAt(i) == '_') {
						sb.append(Character.toUpperCase(name.charAt(i+1)));
						i++;
					}
					else {
						sb.append(name.charAt(i));
					}
				}
			}
			else if(type == 'D') {
				sb.append(Character.toLowerCase(name.charAt(0)));
				for(int i = 1; i < name.length(); i++) {
					if(Character.isUpperCase(name.charAt(i))) {
						sb.append("_");
						sb.append(Character.toLowerCase(name.charAt(i)));
					}
					else {
						sb.append(name.charAt(i));
					}
				}
			}
			System.out.println(sb.toString());
		}
	}
}