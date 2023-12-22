import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

		String s = reader.readLine();
		char[] c = s.toCharArray();
		boolean oddNumber = true;
		boolean evenNumber = true;

		for(int i = 0; i < c.length; i++) {
			//奇数の場合
			if(i%2 == 0){
				if(c[i] == 'L')
					oddNumber = false;
			}
			//偶数の場合
			else{
				if(c[i] == 'R')
					evenNumber = false;
			}
		}

		if(oddNumber && evenNumber){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		} catch(IOException e) {
			System.out.println(e);
		} 
	}
}