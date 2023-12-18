
private static void CircleInRectangle() {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();

		if(((x-r)>=0)&&((y-r)>=0)&&((x+r)<=W)&&((y+r)<=H)){
			System.out.print("yes");
		}
		else System.out.print("no");

	}