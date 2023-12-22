import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int i;
        int s[] = new int[3];
        
        for(i=0;i<3;i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        for(i=0;i<3;i++){
            System.out.print(s[i]);
            if(i==2){
                System.out.println();
                break;
            }
            System.out.print(' ');
        }
        
        sc.close();

	}

}
