import java.io.*;

public class Main{
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int lineNum = Integer.parseInt(br.readLine());
		for(int i=0; i<lineNum; i++){
			line = br.readLine();
			String[] sCoord = line.split(" ");
			float[] fCoord = new float[6];
			for(int j=0; j<6; j++){
				fCoord[j] = Float.parseFloat(sCoord[j]);
			}
			/*
			 * 違う
			 * float cenX = (fCoord[0] + fCoord[2] + fCoord[4])/3.0f;
			 * float cenY = (fCoord[1] + fCoord[3] + fCoord[5])/3.0f;
			 */
			
			float div = (fCoord[0]-fCoord[2])*(fCoord[3]-fCoord[5])-(fCoord[2]-fCoord[4])*(fCoord[1]-fCoord[3]);
			float m = fCoord[0]*fCoord[0] - fCoord[2]*fCoord[2] + fCoord[1]*fCoord[1] - fCoord[3]*fCoord[3];
			float n = fCoord[2]*fCoord[2] - fCoord[4]*fCoord[4] + fCoord[3]*fCoord[3] - fCoord[5]*fCoord[5];
			float a = fCoord[3]-fCoord[5];
			float b = fCoord[3]-fCoord[1];
			float c = fCoord[4]-fCoord[2];
			float d = fCoord[0]-fCoord[2];
			float cenX = (a*m + b*n)/div/2;
			float cenY = (c*m + d*n)/div/2;
			if(cenX == 0.0)cenX=0.0f;
			if(cenY == 0.0)cenY=0.0f;
			float dis = (float)Math.sqrt(Math.pow((double)cenX-fCoord[0], 2.0) + Math.pow((double)cenY-fCoord[1], 2.0));
			System.out.printf("%.3f %.3f %.3f\n", cenX, cenY, dis);
		}
	}
}