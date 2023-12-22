import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int x =scn.nextInt();
        int answer = 0;
        if(x!=1){
            for(int i=2;i<x;i++){
                for(int j=2;;j++){
                    double buf = Math.pow(i,j);
                    if(x<buf) break;
                    if(answer<buf) answer =(int) buf;
                }
            }
    }else{
        answer = 1;
    }
        System.out.println(answer);
    }
}