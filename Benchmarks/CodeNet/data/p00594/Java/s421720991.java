import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		try{
			String str = new String();
			while((str = scanner.next()) != null){
				int n = Integer.parseInt(str);
				if(n == 0) return;

				for(int i = 0; i < n; i++){
					scanner.next();
				}

			}
		}catch(Exception e){
			System.err.println(e);
		}
	}
}