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
			if(i.equals("0 0")){
				break;
			}
			else{
				ss.add(i);
			}
			
		}
		for(int i = 0;i < ss.size() ;i++){
			String[] sss = ss.get(i).split(" ");
			int a = Integer.parseInt(sss[0]);
			int b = Integer.parseInt(sss[1]);
			if(a > b){
				System.out.println(b + " " + a);
			}
			else{
				System.out.println(a + " " + b);
			}
			
		}
		
	}

}