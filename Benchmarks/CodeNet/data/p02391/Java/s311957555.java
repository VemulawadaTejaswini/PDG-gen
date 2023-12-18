import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value[] = new int[2];
		int count = 0;

		String s = br.readLine();
		String[] strArray = s.split(" ");

		try{
			for(int i=0;i<strArray.length;i++){
				if(strArray[i] != " "){
					value[count] = Integer.parseInt(strArray[i]);
					count++;
				}
			}

			if(value[0] < value[1]){
				System.out.println(value[0] + " " + "<" + " " + value[1]);
			}else if(value[0] > value[1]){
				System.out.println(value[0] + " " + ">" + " " + value[1]);
			}else{
				System.out.println(value[0] + " " + "==" + " " + value[1]);
			}

		}catch(ArrayIndexOutOfBoundsException e){
		}
	}
}