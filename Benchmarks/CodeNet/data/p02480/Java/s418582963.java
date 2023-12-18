public class Main {
	public static void main(String[] args) {
		int num;
		BufferedReader br = new BufferedReader(new ImputStreamReader(System.in));
		num = br.readLine();
		num = num * num * num;
		System.out.println(num);
	}
}