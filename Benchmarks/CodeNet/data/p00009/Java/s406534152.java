	public static void main(String[] args) {
		int n = 35;
		int a,b,c,d;
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j > n) break;
				for (int k = 0; k < 10; k++) {
					if(i+ j + k > n) break;
					for (int l = 0; l < 10; l++) {
						if(i+j+k+l > n) break;
						if(i+j+k+l == n) {
							cnt++;
							System.out.println(i + " " + j + " " + k + " " + l);
						}
					}
				}
			}
		}
	}