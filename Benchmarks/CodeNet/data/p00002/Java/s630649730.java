class Main
{
	public static void main(String[] args){
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans;
		try{
			while(true){
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				int s = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				System.out.println(Math.round(Math.log10(s) + 1));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}