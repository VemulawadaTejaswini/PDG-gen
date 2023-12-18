import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		try{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());

			String line;
			for(int i=0;i<n;i++){
				line = br.readLine();
				String[] strArray = line.split(" ");
				for(int j=0;j<strArray.length;j++){
					if(strArray[j].equals("Hoshino")){
						strArray[j] = "Hoshina";
					}
				}
				for(int k=0;k<strArray.length-1;k++){
					if(k==strArray.length-2){
						System.out.print(strArray[k]);
					}else{
						System.out.print(strArray[k]+" ");
					}
				}
				System.out.println(strArray[strArray.length-1]);
			}

		}catch(Exception e){}

	}


}