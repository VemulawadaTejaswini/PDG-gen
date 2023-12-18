import java.io.*;

class SmallLargeEqual2{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		if(-1000 <= a && b <= 1000){
			if (a < b) {
				System.out.println("a < b");
			}

			else if(a > b){
				System.out.println("a > b");
			}

			else if (a == b) {
				System.out.println("a == b");
			}
		}
	}
}