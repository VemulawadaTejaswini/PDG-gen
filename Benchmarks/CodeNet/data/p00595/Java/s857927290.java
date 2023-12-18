public class Main{
	
	public static void main(String[] args) throws IOException{
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder stringBuilder = new StringBuilder();

		while(true){
			String dataSet = bufferedReader.readLine();
			if(dataSet.length()==0) break;
			String[] dataList = dataSet.split(" ");
			int x = Integer.parseInt(dataList[0]);
			int y = Integer.parseInt(dataList[1]);
			if(x>y){
				stringBuilder.append(gcd(x, y) + "\n");	
			}else
			stringBuilder.append(gcd(y, x) + "\n");
			
		}
		System.out.print(stringBuilder);
	}
	
	static int gcd(int x, int y){
		if(y==0){
			return x;
		}else{
			return gcd(y, x%y);
		}
	}
}