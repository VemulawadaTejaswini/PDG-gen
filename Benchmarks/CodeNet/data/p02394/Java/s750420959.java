import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int s[] = new int[5];
        int x1,x2,y1,y2,i;
        for(i = 0;i<5;i++){
            s[i] = sc.nextInt();
        }
        x1 = s[2]-s[4];
        x2 = s[2]+s[4];
        y1 = s[3]-s[4];
        y2 = s[3]+s[4];
        
        if(x1>=0&&x2<=s[0]){
            if(y1>=0&&y2<=s[1]){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
                sc.close();
                return;
            }
        }
        else{
            System.out.println("No");
        }
        
        sc.close();

	}

}
