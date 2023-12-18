import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int bcount = 0;

        for(int i=0;i<n; i++) {
        	if(sc.nextInt()==count+1) {
        		count++;
        	}else {
        		bcount++;
        	}
        }

        System.out.println(bcount!=n?bcount:-1);
        sc.close();
    }
}
