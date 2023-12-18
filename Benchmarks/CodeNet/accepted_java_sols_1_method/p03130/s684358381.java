import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		String[] inputS = new String[2];
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int z=0,y=0,x=0,w=0;
		String ans = "NO";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
			for(int i=0;i<3;i++) {
				inputS = br.readLine().split(" ");
				a.add(Integer.valueOf(inputS[0]));
				b.add(Integer.valueOf(inputS[1]));
			}
		}
		for(int i=0;i<a.size();i++) {
			switch (a.get(i)) {
			case 1:
				z++;
				break;
			case 2:
				y++;
				break;
			case 3:
				x++;
				break;
			case 4:
				w++;
				break;
			default:
				break;
			}
			switch (b.get(i)) {
			case 1:
				z++;
				break;
			case 2:
				y++;
				break;
			case 3:
				x++;
				break;
			case 4:
				w++;
				break;
			default:
				break;
			}
		}
		if(z < 3 && y < 3 && x < 3 && w < 3) {
			ans = "YES";
		}
		System.out.println(ans);
	}
}