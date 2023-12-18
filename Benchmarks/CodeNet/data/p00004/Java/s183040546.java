import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str[] = new String[100];
			str[0] = br.readLine();
			int i = 0;
			while(str[i] != null){
				i++;
				str[i] = br.readLine();
			}
			br.close();

			double a[] = new double[6];

			for(int j=0;j<i+1;j++){
				String str2[] = str[j].split(" ",0);
				for(int k=0;k<6;k++){
					a[k] = Double.parseDouble(str2[k]);
				}

				double x = (a[2]-a[1]*a[5]/a[4])/(a[0]-a[1]*a[3]/a[4]);
				double y = (a[2]-a[0]*a[5]/a[3])/(a[1]-a[0]*a[4]/a[3]);

				System.out.printf("%.3f",x+" "+"%.3f",y);
				System.out.println(" ");
			}

		}catch(IOException e){
			System.out.println("fail");
		}
	}
}
