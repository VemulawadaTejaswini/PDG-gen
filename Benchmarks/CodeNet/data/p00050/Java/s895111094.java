import java.io.*;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		String a = br.readLine();
		String[] fruit = a.split(" ", 0);
		for(int i = 0 ; i < fruit.length ; i++){
			if(fruit[i].equals("apple")){
				fruit[i] = "peach";
			}else if(fruit[i].equals("apple.")){
				fruit[i] = "peach.";
			}else if(fruit[i].equals("peach")){
				fruit[i] = "apple";
			}else if(fruit[i].equals("peach.")){
				fruit[i] = "apple.";
			}
		}
		for(int i = 0 ; i < fruit.length ; i++){
			if(i == fruit.length-1){
				System.out.println(fruit[i]);
			}else{
				System.out.print(fruit[i] + " ");
			}
		}
	}
}