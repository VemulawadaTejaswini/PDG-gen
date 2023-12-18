import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String data = sc.nextLine();
			String[] adata = data.split(" ");
			
			double a = Double.parseDouble(adata[0]);
			double b = Double.parseDouble(adata[1]);
			int n = Integer.parseInt(adata[2]);
			String str = String.valueOf(a/b);
			String[] stra = str.split("\\.");
			String buf = stra[1];
			if(buf.length() < n){
				for(int i = 0 ; i < n ;i++){
					buf += "0";
				}
			}
			buf = buf.substring(0,n);
			String[] snum = buf.split("");
			int sum = 0;
			for(int i = 0 ; i < snum.length ; i++){
				sum += Integer.parseInt(snum[i]);
			}
			System.out.println(sum);
			
		}
		sc.close();
	}

}