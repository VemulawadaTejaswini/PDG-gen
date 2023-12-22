import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] mountain=new int[n];
        for(int i=0;i<n;i++){
            mountain[i]=scn.nextInt();
        }
        int total=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(mountain[i]>=max){
                total++;
                max=mountain[i];
            }
        }
        System.out.println(total);
    }
}