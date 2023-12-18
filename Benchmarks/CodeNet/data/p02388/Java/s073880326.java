public class main {
	public static void main(String[] args) {
		 try {
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		 String x;
			x = buf.readLine();
		 int y = Integer.parseInt(x);
		int z = y*y*y;
		System.out.println(z);
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
    }
}