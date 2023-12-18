import java.io.*;

class Main {

	public static void main(String args[]) throws IOException {
		int num;
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		
		num = Integer.parseInt(br.readLine());
		
		String[] str = new String[num];
		
		for(int i=0;i<num;i++){
			str[i] = br.readLine();
		}
		
		String temp;
		
		for(int i=1;i<num;i++){
			for(int j=0;j<num-i;j++){
				if(str[j].compareTo(str[j+1]) > 0){
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		
		System.out.println(str[0]);
	}
	
}