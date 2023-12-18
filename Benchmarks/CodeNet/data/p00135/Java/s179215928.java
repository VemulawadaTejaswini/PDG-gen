import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			for(int i=0; i<size; i++){
				line = in.readLine();
				String[] tmp = line.split(":");
				int h = Integer.parseInt(tmp[0]);
				int m = Integer.parseInt(tmp[1]);
				double sangle = 30.0 * h + 0.5 * m;
				double langle = 6.0 * m;
				double theta = Math.abs(sangle - langle);

				if(theta < 30.0){
					System.out.println("alert");
				}
				else if(theta < 90.0){
					System.out.println("warning");
				}
				else{
					System.out.println("safe");
				}
			}
		}
	}
}