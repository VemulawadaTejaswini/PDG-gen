import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int answer=0;
        for(int i=0;i<n;i++){
            int buf =scn.nextInt();
            int cnt=0;
            while(buf%2==0){
                buf/=2;
                cnt++;
            }
          	if(i==0){
            	answer=cnt;
            }else{
            	answer=Math.min(cnt,answer);
            }
        }
        System.out.println(answer);
    }
}
