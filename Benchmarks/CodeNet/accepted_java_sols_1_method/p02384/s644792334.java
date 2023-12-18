import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[7];
        int x,y,ans=1;
		for (int i = 1; i < 7; i++) {
			a[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		for(int i=0;i<q;i++){
		    x=scanner.nextInt();
		    y=scanner.nextInt();
		    if(x==a[1]||x==a[6]){
		        if (y == a[2]){
					ans = 3;
				}else if (y == a[3]){
					ans = 5;
				}else if (y == a[4]){
					ans = 2;
				}else{
					ans = 4;
				}
		    }else if(x==a[2]||x==a[5]){
		        if (y == a[1]){
					ans = 4;
				}else if (y == a[3]){
					ans = 1;
				}else if (y == a[4]){
					ans = 6;
				}else{
					ans = 3;
				}
		    }else if(x==a[3]||x==a[4]){
		        if (y == a[1]){
					ans = 2;
				}else if (y == a[2]){
					ans = 6;
				}else if (y == a[5]){
					ans = 1;
				}else{
					ans = 5;
				}
		    }
		    if (x == a[4] || x == a[5] || x == a[6])
				ans = 7 - ans;
		    System.out.println(a[ans]);
		    }
	    }
	}
