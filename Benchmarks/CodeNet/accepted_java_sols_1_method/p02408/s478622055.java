import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			List<Integer> inSpades = new ArrayList<>();
			List<Integer> inHearts = new ArrayList<>();
			List<Integer> inClub = new ArrayList<>();
			List<Integer> inDia = new ArrayList<>();

			final Integer maxLine = Integer.valueOf(br.readLine());

			for (int i = 0; i < maxLine; i++) {

				final String inputLine = br.readLine();

				final String[] set = inputLine.split(" ");

				final String suit = set[0];
				final Integer number = Integer.valueOf(set[1]);

				switch(suit) {
				case "S":
					inSpades.add(number);
					break;
				case "H":
					inHearts.add(number);
					break;
				case "C":
					inClub.add(number);
					break;
				case "D":
					inDia.add(number);
				}
			}

			List<Integer> outSpades = new ArrayList<>();
			List<Integer> outHearts = new ArrayList<>();
			List<Integer> outClubs = new ArrayList<>();
			List<Integer> outDias = new ArrayList<>();
			for(int i = 1; i <= 13; i++) {
				outSpades.add(i);
				outHearts.add(i);
				outClubs.add(i);
				outDias.add(i);
			}

			 outSpades.removeAll(inSpades);
			 outHearts.removeAll(inHearts);
			 outClubs.removeAll(inClub);
			 outDias.removeAll(inDia);

			 StringBuilder result = new StringBuilder();

			 int count = 0;
			 for(int i = 0; i < outSpades.size(); i++) {
				 if(0 < count++) {
					 result.append("\n");
				 }
				 result.append("S " + outSpades.get(i));
			 }
			 for(int i = 0; i < outHearts.size(); i++) {
				 if(0 < count++) {
					 result.append("\n");
				 }
				 result.append("H " + outHearts.get(i));
			 }
			 for(int i = 0; i < outClubs.size(); i++) {
				 if(0 < count++) {
					 result.append("\n");
				 }
				 result.append("C " + outClubs.get(i));
			 }
			 for(int i = 0; i < outDias.size(); i++) {
				 if(0 < count++) {
					 result.append("\n");
				 }
				 result.append("D " + outDias.get(i));
			 }

			 if(!result.toString().equals("")) {
				 System.out.println(result);
			 }
		}
	}
}
