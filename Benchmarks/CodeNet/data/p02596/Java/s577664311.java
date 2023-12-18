import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        int res = 1;
        int seven = 7%K; 
        if(K%2==0){
            System.out.println("-1");
            return;
        }else{
            while(seven!=0){
                res++;
                seven = (seven*10+7)%K;
            }
            System.out.println(res);

        }
		
	}
}