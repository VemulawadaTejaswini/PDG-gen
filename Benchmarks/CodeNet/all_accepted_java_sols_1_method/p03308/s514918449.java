import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] A=new int[N];
        int i;
        int answer=0;
        for(i=0;i<N;i++){
            A[i]=scan.nextInt();
            for(int j=0;j<i;j++){
                if(answer<Math.abs(A[i]-A[j])){
                    answer=Math.abs(A[i]-A[j]);
                }
            }
        }
        System.out.println(answer);
    }
}