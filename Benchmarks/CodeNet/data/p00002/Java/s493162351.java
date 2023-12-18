import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {
		int s1 = 0,s2 = 0,i= 0;
		String Set;
		String[] stock = new String[2];
		String Input = null;
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			while((Input = in.readLine()) != null){
				stock = Input.split(" ");
				s1 = Integer.parseInt(stock[0]);
				s2 = Integer.parseInt(stock[1]);
				Set[0] = String.valueOf(s1 + s2);
				System.out.println(Set[0].length());
			}
			
		}catch(Exception e){
		}
    }
}