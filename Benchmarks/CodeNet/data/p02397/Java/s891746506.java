/*
 * Aizu Online Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			InputData inputData = new InputData();
			inputData.setDataFromLines(br);
			inputData.setValues();
			Processing processing = new Processing(inputData);
			System.out.println(processing.getResult());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	public static final String SEPARATOR = " ";

	private List<String> rows = new ArrayList<>();
	private String row;
	private List<RowValues> rowValues = new ArrayList<>();

	public InputData() {
	}

	public void setDataFromLine(BufferedReader br) throws IOException {
		this.row = br.readLine().trim();
	}

	public void setDataFromLines(BufferedReader br) throws IOException {
		String line;
		while ((line = br.readLine()) != null) {
			this.rows.add(line.trim());
		}
	}

	public void setValues() {
		for (String str : this.rows) {
			RowValues rowValue = new RowValues();
			String[] values = str.split(InputData.SEPARATOR);
			rowValue.setNum0(Integer.valueOf(values[0]));
			rowValue.setNum1(Integer.valueOf(values[1]));
			this.rowValues.add(rowValue);
		}

	}

	public List<RowValues> getRowValues() {
		return rowValues;
	}

	public void setRowValues(List<RowValues> rowValues) {
		this.rowValues = rowValues;
	}
}

class RowValues {

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

	public void sort() {
		if (this.num0 > this.num1) {
			Integer temp = this.num0;
			this.num0 = this.num1;
			this.num1 = temp;
		}
	}
}

class Processing {

	private static final String RETCODE = System.getProperty("line.separator");

	private InputData inputData;

	public Processing(InputData inputData) {
		this.inputData = inputData;
	}

	public String getResult() {
		String result = null;
		StringBuilder sb = new StringBuilder();
		for (RowValues rowValue : this.inputData.getRowValues()) {
			if (rowValue.getNum0() == 0 && rowValue.getNum1() == 0) {
				break;
			}
			rowValue.sort();
			sb.append(rowValue.getNum0());
			sb.append(InputData.SEPARATOR);
			sb.append(rowValue.getNum1());
			sb.append(RETCODE);
		}
		result = sb.toString().trim();
		return result;
	}
}