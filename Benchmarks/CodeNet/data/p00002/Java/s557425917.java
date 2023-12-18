class Main{

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] numbers;
		int a = 0;
		int b = 0;
		int sum = 0;
		int ans = 1;
		
		while ((line = br.readLine()) != null) {
            numbers = line.split(" ");
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[1]);
            sum = a + b;
            
            while((sum /= 10) > 0){
            	ans++;
            }
            System.out.println(ans);
        }
	}
}