import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        String answer = "Yes";

        int t1=0;
        int x1=0;
        int y1=0;
        for(int i=0;i<n;i++){
            int t2=scn.nextInt();
            int x2=scn.nextInt();
            int y2=scn.nextInt();
           int  difT=t2-t1;
            int difX=Math.abs(x1-x2);
            int difY=Math.abs(y1-y2);
            if(difT-(difX+difY)<0||(difT-(difX+difY))%2==1){
                answer="No";
                break;
            }else{
                t1=t2;
                x1=x2;
                y1=y2;
            }
        }
        System.out.println(answer);
    }
}
