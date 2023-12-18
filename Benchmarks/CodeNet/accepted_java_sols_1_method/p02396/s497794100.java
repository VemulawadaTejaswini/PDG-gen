import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int x;
        for(i=1; ;i++){
            x = sc.nextInt();
            if(x==0){
                break;
            }
            System.out.printf("Case %d: %d\n",i,x);
        }
    }
}
