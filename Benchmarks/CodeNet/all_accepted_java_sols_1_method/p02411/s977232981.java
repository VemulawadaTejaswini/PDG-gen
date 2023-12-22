import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] strargs;
		String grade;
		int m, f, r, score;

		do {
			grade = null;
			strargs = br.readLine().split("\\s+");
			m = Integer.parseInt(strargs[0]);
			f = Integer.parseInt(strargs[1]);
			r = Integer.parseInt(strargs[2]);
			score = Math.addExact(m, f);
			
			if (score >= 80) 		{	grade = "A";
			} else if (score >= 65) {	grade = "B";
			} else if (score >= 50) {	grade = "C";
			} else if (r >= 50)	 	{	grade = "C";
			} else if (score >= 30) {	grade = "D";
			} else					{	grade = "F";
			}
			if (m == -1 || f == -1) grade ="F";
			if (m == -1 && f == -1 && r == -1) break;
			sb.append(grade);
			sb.append("\n");
		} while(true);
		
		System.out.print(sb);
	}
}