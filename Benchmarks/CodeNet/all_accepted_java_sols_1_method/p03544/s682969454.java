import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        long answer=0;
        long b1=0;
        long b2=0;
        for(int i=0;i<=n;i++){
            if(i==0){
                answer =2;
                b1=2;
            }else if(i==1){
                answer =1;
                b2=1;
            }else{
                answer =b1+b2;
                b1=b2;
                b2=answer;
            }
        }
        System.out.println(answer);
    }
}