
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int dataNum = Integer.parseInt(br.readLine());
			for(int i=0;i<dataNum;i++){
				String[] lines = br.readLine().split(" ");
				int a = Integer.parseInt(lines[0]),b=Integer.parseInt(lines[1]),c=Integer.parseInt(lines[2]);
				if(isRightTriangle(a, b, c)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}
		catch(Exception e){
			return;
		}
	}
	
	private static Boolean isRightTriangle(int a,int b,int c){
		return (a * a + b * b) == ( c * c);
	}
}