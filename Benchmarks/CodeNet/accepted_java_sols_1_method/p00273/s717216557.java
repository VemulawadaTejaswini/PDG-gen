//Admission Fee
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		 int n =Integer.parseInt(in.readLine());
		 
		 for(int i=0;i<n;i++){

			 String[] xybp = in.readLine().split(" ");

			 int x= Integer.parseInt(xybp[0]);
			 int y= Integer.parseInt(xybp[1]);
			 int b= Integer.parseInt(xybp[2]);
			 int p= Integer.parseInt(xybp[3]);
			 
			 int reg = x * b + y * p;
			 
			 if(b<5){
				 b=5;
			 }
			 if(p<2){
				 p=2;
			 }
			 
			 int dis = (int)(0.8 * (x * b + y * p));
			 
			 if(reg<dis){
				 System.out.println(reg);
			 }else{
				 System.out.println(dis);
			 }
			 
		 }
		 
	}
}