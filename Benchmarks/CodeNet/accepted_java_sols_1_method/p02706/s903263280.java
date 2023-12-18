import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String[] NM = (scn.nextLine()).split(" ");
        int N = Integer.valueOf(NM[0]);
        int M = Integer.valueOf(NM[1]);
        String[] Am = (scn.nextLine()).split(" ");
        int sum = 0;
        int result = 0;
        for(int i=0;i<M;i++){
            sum += Integer.valueOf(Am[i]);
        }
        if(sum <= N){
            result = N -sum;
        }else{
            result = -1;
        }
        System.out.println(result);

    }
}