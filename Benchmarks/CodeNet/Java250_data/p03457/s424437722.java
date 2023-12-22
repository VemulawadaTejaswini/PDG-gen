import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] str =  new String[N+1];
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		t [0] = 0;
		x [0] = 0;
		y [0] = 0;
		
		for(int i = 1; i <= N; i++ ) {
			str[i]= sc.nextLine(); 
		}
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			String[] s = str[i].split(" ");
			t[i] = Integer.parseInt(s[0]);
			x[i] = Integer.parseInt(s[1]);
			y[i] = Integer.parseInt(s[2]);
		}
		
		for(int j = 0; j < N; j++) {
			int absT = t[j+1] - t[j];
			int absX = Math.abs(x[j+1] - x[j]);
			int absY = Math.abs(y[j+1] - y[j]);
	
            if(absT < absX + absY || absT % 2 != (absX + absY) % 2 ) {
                System.out.println("No");
                System.exit(0);
            } 
		}
		System.out.println("Yes");
	}
}