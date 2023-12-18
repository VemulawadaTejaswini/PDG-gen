import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			double maxDist = Double.parseDouble(br.readLine());
			if(maxDist == 0) break;
			
			String str = br.readLine();
			int prevPos = -1;
			int sPos = str.indexOf(" ");
			
			double px = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			sPos = str.indexOf(" ", sPos+1);
			
			double py = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			sPos = str.indexOf(" ", sPos+1);
			
			double vx = Double.parseDouble(str.substring(prevPos+1, sPos));
			prevPos = sPos;
			
			double vy = Double.parseDouble(str.substring(prevPos+1));
			
			double mp = Math.atan2(py, px);
			double mv = Math.atan2(vy, vx);
			
			double fmp = Math.abs((mp + Math.PI) % Math.PI);
			double fmv = Math.abs((mv + Math.PI) % Math.PI);
			
			if(fmp > fmv + 0.0000001 || fmp < fmv - 0.0000001) {
				System.out.println("impossible"); continue;
			}
			
			double dist = Math.sqrt(py*py + px*px);
			
			if(Math.signum(mp) == Math.signum(mv))
				dist += 2 - dist*2;
			
			if(maxDist < dist)
				System.out.println("impossible");
			else
				System.out.println(dist);
		}
	}
}