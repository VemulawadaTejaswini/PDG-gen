import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int n = Integer.parseInt(br.readLine());
		String a[] = new String[n];
		for(int i = 0; i < n ; i++){
			a[i] = br.readLine();
		}
		for(int i = 0 ; i < n ; i++){
			String[] fruit = a[i].split(" ", 0);
			for(int j = 0; j < fruit.length ; j++){
				if(fruit[j].equals("Hoshino")){
					fruit[j] = "Hoshina";
				}
				if(j == fruit.length-1){
					System.out.println(fruit[j]);
				}else{
					System.out.print(fruit[j] + " ");
				}
			}
		}
	}
}