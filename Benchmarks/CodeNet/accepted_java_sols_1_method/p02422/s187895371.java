import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
	public static void main(String...args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int times = Integer.valueOf(br.readLine());

		for(int i = 0; i < times; i++) {
			String[] command = br.readLine().split(" ");
			int start = Integer.valueOf(command[1]);
			int end   = Integer.valueOf(command[2]);
			switch(command[0]) {
				case "replace" :
					String replace = command[3];
					str = str.substring(0 , start) + replace + str.substring(end + 1, str.length());
					break;
				case "reverse" :
					StringBuffer rStr = new StringBuffer(str.substring(start , end + 1));
					str = str.substring(0 , start) + rStr.reverse().toString() + str.substring(end + 1, str.length());
					break;
				case   "print" :
					System.out.println(str.substring(start , end + 1));
					break;
		    }
	    }
    }
}

