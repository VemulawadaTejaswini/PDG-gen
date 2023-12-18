public class Main{
	public static void main(String[] a) throws Exception {
		int[] heights = new int[10];
		for (int i = 0; i < 10; i++) {
			BufferedReader height = new BufferedReader(new InputStreamReader(System.in));	
			heights[i] = Integer.parseInt(height.readLine());
			System.out.println(heights[i]);
		}
		Arrays.sort(heights);
		System.out.println(heights[0]);
		System.out.println(heights[1]);
		System.out.println(heights[2]);
	}
}