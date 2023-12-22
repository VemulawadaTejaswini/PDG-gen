class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(480);
		for(int i = 1; i <= 9; i++) for(int j = 1; j <= 9; j++)
				sb.append(i).append("x").append(j).append("=").append(i*j).append("\n");
		System.out.print(sb);
	}
}