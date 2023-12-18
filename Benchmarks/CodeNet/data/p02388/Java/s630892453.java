import java.io.*;
class ITP1_1B{
	public static void main(String arg[]){
		int x;
		
		try{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			
			x = Integer.parseInt(d.readLine());
			
			System.out.println((x*x*x));
			
		} catch (Exception e){
			System.out.println("??°????????\????????????????????????");
		}
	}
}