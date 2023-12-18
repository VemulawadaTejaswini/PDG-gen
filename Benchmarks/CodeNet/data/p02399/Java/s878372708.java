/*
 * Aizu Online Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yoshkur
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataController controller = new DataController();
			controller.setDataFromLine(br);
			br.close();
			System.out.println(controller.getResult());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class DataService {

	private List<DataEntity> entities = new ArrayList<>();
	private DataEntity entity;

	public DataService() {
	}

	public List<DataEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<DataEntity> entities) {
		this.entities = entities;
	}

	public DataEntity getEntity() {
		if (this.entity == null) {
			this.entity = new DataEntity();
		}
		return entity;
	}

	public void setEntity(DataEntity entity) {
		this.entity = entity;
	}
}

class DataEntity {

	Integer num0;
	Integer num1;

	public Integer getNum0() {
		return num0;
	}

	public void setNum0(Integer num0) {
		this.num0 = num0;
	}

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

}

class DataController {

	private static final String RETCODE = System.getProperty("line.separator");
	public static final String SEPARATOR = " ";

	private final DataService ejb;

	public DataController() {
		this.ejb = new DataService();
	}

	public void setDataFromLine(BufferedReader br) throws IOException {
		String[] values = br.readLine().trim().split(SEPARATOR);
		this.ejb.getEntity().setNum0(Integer.valueOf(values[0]));
		this.ejb.getEntity().setNum1(Integer.valueOf(values[1]));
	}

	public void setDataFromLines(BufferedReader br) throws IOException {
		String line;
		while ((line = br.readLine()) != null) {
			DataEntity entity = new DataEntity();
			String[] values = line.trim().split(SEPARATOR);
			entity.setNum0(Integer.valueOf(values[0]));
			entity.setNum1(Integer.valueOf(values[1]));
			this.ejb.getEntities().add(entity);
		}
	}

	public String getResult() {
		String result = null;
		NumberFormat nf = new DecimalFormat("0.00000");
		StringBuilder sb = new StringBuilder();
		sb.append(this.ejb.getEntity().getNum0() / this.ejb.getEntity().getNum1());
		sb.append(SEPARATOR);
		sb.append(this.ejb.getEntity().getNum0() % this.ejb.getEntity().getNum1());
		sb.append(SEPARATOR);
		sb.append(nf.format(BigDecimal.valueOf(this.ejb.getEntity().getNum0().doubleValue() / this.ejb.getEntity().getNum1().doubleValue())));
		result = sb.toString().trim();
		return result;
	}
}