import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int cnt = 0;
        
        for (int i = 1; i <= N; i++) {
			if(i < 10) cnt++;
			if(i >=100 && i < 1000) cnt++;
			if(i >=10000 && i < 100000) cnt++;
			if(i >=1000000 && i < 10000000) cnt++;
		}
        System.out.println(cnt);
       
    }
}