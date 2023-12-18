import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] a) {
	      String line = "";
	      try {
	        BufferedReader stdReader =
	          new BufferedReader(new InputStreamReader(System.in));
	        line = stdReader.readLine();
	        stdReader.close();
	      } catch (Exception e) {
	        e.getStackTrace();
	        System.exit(-1); // ????????°???????????????
	      }
		// TODO ?????????????????????????????????????????????
		int debt = 100000;
		int n = 0;
		n = Integer.parseInt(line);
		for(int i=0;i<n;i++){
			debt = interest(debt);
		}
		System.out.println(debt);
	}

	public static int interest(int n){
		double added;
		added = n * 1.05;
		added = 1000*Math.ceil(added/1000);
		return (int)added;
	}

}