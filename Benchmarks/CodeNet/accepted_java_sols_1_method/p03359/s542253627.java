import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count=0;
        for(int m=1;m<=a; m++) {
        	if(m==a) {
        		for(int y=1;y<=b; y++) {
        			if(m==y) {
        				count++;
        			}
        		}
        	}else {
        		for(int y2=1;y2<=31;y2++) {
        			if(a==y2) {
        				count++;
        			}
        		}
        	}
        }
        System.out.println(count);
	}

}