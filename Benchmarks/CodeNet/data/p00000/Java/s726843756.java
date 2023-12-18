public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				sb.append(i).append("x").append(j).append("=").append(i * j).append("\n");
			}
		}
		sb.setLength(sb.length() - 1);
		System.out.println(sb.toString());
	}
}