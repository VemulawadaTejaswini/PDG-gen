import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] check= new int[101];
        Arrays.fill(check,0);
        int answer = 0;
        for(int i=0;i<n;i++){
            int buf  = scn.nextInt();
            if(check[buf]==0){
                check[buf]++;
                answer++;
            }
        }
        System.out.println(answer);
    }
}