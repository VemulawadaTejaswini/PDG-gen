import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();

		HashMap codeMap = new HashMap();
		for (int i=0; i<10; i++) {
			int index1 = s.indexOf('0' + i);
			if (index1 == -1)
				continue;
			for (int j=0; j<10; j++) {
				int index2 = s.substring(index1+1).indexOf('0' + j);
				if (index2 == -1)
					continue;
				for (int k=0; k<10; k++) {
					int index3 = s.substring(index1+1+index2+1).indexOf('0' + k);
					if (index3 == -1)
						continue;
					String key = "" + s.charAt(index1);
					key += s.charAt(index1+1+index2);
					key += s.charAt(index1+1+index2+1+index3);
					codeMap.put(key,"");
				}
			}
		}
		System.out.println(codeMap.size());
	}
}