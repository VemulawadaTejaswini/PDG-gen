import java.io.*;
class Main{
	public static void main(String[] args){
		
		try{
		
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


			String c = in.readLine();
			String[] str = c.split(" ");
			int[] num = new int[str.length];
			for(int i=0;i<str.length;i++){
				num[i] = Integer.parseInt(str[i]);
			}
			if(num.length == 2){
				System.out.print(num[0]*num[1] + " " );
				System.out.println(2*(num[0]+num[1]));
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}