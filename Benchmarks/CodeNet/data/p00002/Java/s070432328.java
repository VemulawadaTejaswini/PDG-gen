import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while (null != (str = in.readLine())) {
				String[] sar = str.split(" ");
				System.out.println(String.valueOf(Integer.parseInt(sar[0]) + Integer.parseInt(sar[1])).length());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}