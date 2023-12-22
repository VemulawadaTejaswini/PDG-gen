import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int dice=scn.nextInt();
        int win=scn.nextInt();
        int cnt=0;
        double probability=0;
        for(int i=1;i<=dice;i++){
            int score=i;
            while(true){
                if(win>score){
                    score*=2;
                    cnt++;
                }else{
                    probability+=1.0/dice*Math.pow(0.5,(double)cnt);
                    cnt=0;
                    break;
                }
            }
        }
        System.out.println(probability);
    }
}