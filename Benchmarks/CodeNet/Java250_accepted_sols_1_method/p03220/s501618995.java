import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int t=scn.nextInt();
        int a=scn.nextInt();
        int[] place=new int[n];
        for(int i=0;i<n;i++){
            place[i]=scn.nextInt();
        }
        double dif=Math.abs(t-0.006*place[0]-a);
        int answer =0;
        for(int i=1;i<n;i++){
            if(Math.abs(t-0.006*place[i]-a)<dif){
                dif =Math.abs(t-0.006*place[i]-a);
                answer = i;
            }
        }
        System.out.println(answer+1);
    }
}