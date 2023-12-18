import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int							key    = 0;
		int							len    = 0;
		int[]						team   = null;
		String						number = null;
		HashMap<Integer, Integer>	teams  = new HashMap<Integer, Integer>();
		ArrayList<Integer>			points = new ArrayList<Integer>();

		while ((team = parseTeam()) != null) {
			teams.put(team[0], team[1]);
			if (!points.contains(team[1])) {
				points.add(team[1]);
			}
		}

		len = points.size();
		Collections.sort(points);

		while ((number = parseStdin()) != null) {
			key = Integer.parseInt(number);
			System.out.println(len - points.indexOf(teams.get(key)));
		}
	}

	private static int[] parseTeam() {
		int[]		team  = null;
		String		stdin = null;
		String[]	split = null;

		if ((stdin = parseStdin()) != null) {
			if (!stdin.equals("0,0")) {
				team    = new int[2];
				split   = stdin.split(",");
				team[0] = Integer.parseInt(split[0]);
				team[1] = Integer.parseInt(split[1]);
			}
		}
		
		return team;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					stdin = line;
				}
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}