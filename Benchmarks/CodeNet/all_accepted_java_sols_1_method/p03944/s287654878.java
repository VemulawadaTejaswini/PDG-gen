
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		int w = Integer.parseInt(list[0]);
		int h = Integer.parseInt(list[1]);
		int n = Integer.parseInt(list[2]);

		String[][] xya = new String[n][];

		for(int i=0; i<n; i++){
			String string = input.readLine();
			xya[i] = string.split(" ");
		}

		int xmin = 0;
		int xmax = w;
		int ymin = 0;
		int ymax = h;

		for(int i=0; i<n; i++){
			if(xya[i][2].equals("1")){
				if(Integer.parseInt(xya[i][0]) > xmin){
					xmin = Integer.parseInt(xya[i][0]);
				}
			}else if(xya[i][2].equals("2")){
				if(Integer.parseInt(xya[i][0]) < xmax){
					xmax = Integer.parseInt(xya[i][0]);
				}
			}else if(xya[i][2].equals("3")){
				if(Integer.parseInt(xya[i][1]) > ymin){
					ymin = Integer.parseInt(xya[i][1]);
				}
			}else if(xya[i][2].equals("4")){
				if(Integer.parseInt(xya[i][1]) < ymax){
					ymax = Integer.parseInt(xya[i][1]);
				}
			}
		}

		if(xmin > xmax || ymin > ymax){
			System.out.println("0");
		}else{
			int answer = (xmax-xmin) * (ymax-ymin);
			System.out.println(answer);
		}


	}

}
