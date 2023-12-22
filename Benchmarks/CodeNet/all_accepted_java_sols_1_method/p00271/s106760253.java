import java.util.Scanner;
public class Main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int MT[] ={0,0,0,0,0,0,0};
        int LT[] ={0,0,0,0,0,0,0};

        for(int n = 0;n < 7;n++){
            MT[n] = sc.nextInt();
            LT[n] = sc.nextInt();
        }

        for(int i = 0;i < 7;i++){
            MT[i] = MT[i] - LT[i];
            System.out.println(MT[i]);
    	}
    }
}