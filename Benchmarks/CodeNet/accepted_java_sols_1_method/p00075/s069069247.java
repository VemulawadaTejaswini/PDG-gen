
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		double omosa, takasa, BMI;
		String data, dataperson[];
		while( sc.hasNext()) {
			data = sc.next();
			dataperson = data.split(",",3);
			id = Integer.valueOf(dataperson[0]);
			omosa = Double.valueOf(dataperson[1]);
			takasa = Double.valueOf(dataperson[2]);
			if(omosa/(takasa*takasa)>=25.0) System.out.println(id);
		}
	}

}
