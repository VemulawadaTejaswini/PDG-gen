import java.io.IOException;

public class Main{
    public static void main(String[] a) throws IOException {
		int s1 = 0,s2 = 0,i= 0;
		String[] Set = new String[5];
		String[] stock = new String[5];
		String Input = null;
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			while((Input = in.readLine()) != null){
				stock = Input.split(" ");
				s1 = Integer.parseInt(stock[0]);
				s2 = Integer.parseInt(stock[1]);
				Set[i] = String.valueOf(s1 + s2);
				System.out.println(Set[i].length());
				i++;
			}
			
		}catch(Exception e){
		}
    }
}