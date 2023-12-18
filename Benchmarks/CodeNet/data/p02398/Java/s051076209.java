import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData;
            inputData = reader.readLine();
			String[] strNumber = inputData.split(" ");
			int aa = Integer.parseInt(strNumber[0]);
			int bb = Integer.parseInt(strNumber[1]);
			int cc = Integer.parseInt(strNumber[2]);
			int count = 0;
			for(int i = aa ; i < bb + 1 ; i++){
				if(cc % i == 0){
					count++;
				}
			}

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }


	}

}