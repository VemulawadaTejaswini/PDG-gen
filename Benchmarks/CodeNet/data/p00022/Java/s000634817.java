import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            int max = scan.nextInt();
            int res = max;
            for(int i = 1,t = 0;i < n;i++){
            	max = maximum(t=scan.nextInt(),t+max);
            	res = maximum(res,max);
            }
            System.out.println(res);
        }
    }
    public static int maximum(int a,int b){
        return (a > b)?a:b;
    }
}