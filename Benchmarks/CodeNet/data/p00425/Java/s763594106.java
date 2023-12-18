import java.io.*; // namespace...

class 0502 {
	
	public static void main() {
		
		System.out.printf("%d%n", solve());
		return;
	} 
	
	private int solve() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferdReader br = new BufferedReader(isr);
		
		int ret = 1;
		String buf;
		
		int dtop=1, dforward=2, dside=3;
		
		
		while((buf = br.readLine()) != null) {
			int tmp;
			switch(buf) {
			case "North":
				tmp = dtop;
				dtop = dforward;
				dforward = 7-tmp;
				break;
			case "South":
				tmp = dtop;
				dtop = 7-dforward;
				dforward = tmp;
				break;
			case "West":
				tmp = dtop;
				dtop = dside;
				dside = 7-tmp;
				break;
			case "East":
				tmp = dtop;
				dtop = 7-dside;
				dside = tmp;
				break;
			case "Right":
				tmp = dforward;
				dforward = dside;
				dside = 7-tmp;
				break;
			case "Left":
				tmp = dforward;
				dforward = 7-dside;
				dside = tmp;
			}
			ret += dtop;
		}
		return ret;
	}
}