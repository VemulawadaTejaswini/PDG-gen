class Main {
	public static void main(String[] args) {
		int ttl = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		String ttlToString = "" + ttl;
		int length = ttlToString.length();
		System.out.println(length);
	}
}