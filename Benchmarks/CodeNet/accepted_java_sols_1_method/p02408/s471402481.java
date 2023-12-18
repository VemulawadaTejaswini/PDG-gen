import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		int n = Integer.parseInt(line1);
		int s[] = new int[13];
		int h[] = new int[13];
		int c[] = new int[13];
		int d[] = new int[13];
		for(int i = 0; i < 13; i++){
			s[i] = 0;
			h[i] = 0;
			c[i] = 0;
			d[i] = 0;
		}
		for(int j = 0; j < n; j++){
			String line = reader.readLine();
			String[] sarray = line.split(" ", -1);
			if(sarray[0].equals("S")){
				s[(Integer.parseInt(sarray[1]) - 1)]++;
			} else if(sarray[0].equals("H")){
				h[(Integer.parseInt(sarray[1]) - 1)]++;
			} else if(sarray[0].equals("C")){
				c[(Integer.parseInt(sarray[1]) - 1)]++;
			} else if(sarray[0].equals("D")){
				d[(Integer.parseInt(sarray[1]) - 1)]++;
			}
		}
		for(int k = 0; k < 4; k++){
			for(int l = 0; l < 13; l++){
				switch(k){
					case 0:
						if(s[l] == 0){
							System.out.println("S " + (l + 1));
						}
						break;
					case 1:
						if(h[l] == 0){
							System.out.println("H " + (l + 1));
						}
						break;
					case 2:
						if(c[l] == 0){
							System.out.println("C " + (l + 1));
						}
						break;
					default:
						if(d[l] == 0){
							System.out.println("D " + (l + 1));
						}
				}
			}
		}
	}
}