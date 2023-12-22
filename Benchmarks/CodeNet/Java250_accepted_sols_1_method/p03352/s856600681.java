import java.util.Scanner;;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 1;i<=1000;i++){
            for(int j = 2;j<20;j++){
                int tmp = (int)Math.pow(i,j);
                if(tmp>a){
                    break;
                }
                if(max < tmp && tmp<=a){
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
}