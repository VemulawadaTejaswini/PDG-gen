import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;
		int hosu = 0;
		int kakudo = 90;
		double[] position = {0.0, 0.0};

		try {
			while(null != (tmpString = bf.readLine())){
				String[] tmp = tmpString.split(",");
				if(tmp[0].equals("0") && tmp[1].equals("0")){
					break;
				}
				hosu = Integer.parseInt(tmp[0]);
				int tmpkakudo = Integer.parseInt(tmp[1]);
				if(tmpkakudo > 0){
					tmpkakudo = 360 - tmpkakudo;
				} else {
					tmpkakudo *= -1;
				}

				if(kakudo % 90 == 0){
					switch(kakudo / 90){
					case 0:
						position[0] += hosu;
						break;
					case 1:
						position[1] += hosu;
						break;
					case 2:
						position[0] -= hosu;
						break;
					case 3:
						position[1] -= hosu;
						break;
					}
				} else {
					if(kakudo < 90){
						position[0] += Math.cos(kakudo) * hosu;
						position[1] += Math.sin(kakudo) * hosu;
					} else if(kakudo < 180) {
						position[0] -= Math.cos(180 - kakudo) * hosu;
						position[1] += Math.sin(180 - kakudo) * hosu;
					} else if(kakudo < 270) {
						position[0] -= Math.cos(kakudo - 180) * hosu;
						position[1] -= Math.sin(kakudo - 180) * hosu;
					} else {
						position[0] += Math.cos(360 - kakudo) * hosu;
						position[1] -= Math.sin(360 - kakudo) * hosu;
					}
				}

				kakudo += tmpkakudo;
				kakudo %= 360;
			}

			System.out.println((int)position[0]);
			System.out.println((int)position[1]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}
}