import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,c,k,sum=0;
        Scanner scn = new Scanner(System.in);

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        k = scn.nextInt();

        for(int i=0;i<k;i++){
            if(a > 0){
                sum++;
                a--;
            }else if(b > 0){
                b--;
            }else{
                sum--;
                c--;
            }
        }

        System.out.println(sum);
    }
}