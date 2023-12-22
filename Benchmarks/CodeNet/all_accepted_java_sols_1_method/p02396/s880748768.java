import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<String> ss = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String i = new String(in.readLine());
			if(i.equals("0")){
				break;
			}
			else{
				ss.add(i);
			}
			
		}
		for(int i = 0;i < ss.size() ;i++){
			System.out.println("Case "+(i+1)+": " + ss.get(i));
		}
		
	}

}