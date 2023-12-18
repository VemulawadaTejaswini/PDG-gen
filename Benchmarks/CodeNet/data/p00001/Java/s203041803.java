public class  Main{
	public static void main(String[] args) throws Exception {
			
			// buffer from input
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));			
			// read by line until the end of file
			String line;
			String thisToken;
			ArrayList<Integer> heightMountain = new ArrayList<Integer>();
			int thisVal;
		
			for(int i = 0; i<10 ; i++){
				// Stringify the line
				line = in.readLine();
				StringTokenizer st = new StringTokenizer(line);
				thisToken = st.nextToken();
				thisVal = Integer.parseInt(thisToken);
				heightMountain.add(thisVal);
				
				Collections.sort(heightMountain);
				
				
			// Output
			}
			for(int i = 9; i>6; i--){
				System.out.println(heightMountain.get(i));
			}

			
		}
}