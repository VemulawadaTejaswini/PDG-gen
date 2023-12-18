import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int[] time=new int[5];
        for(int i=0;i<5;i++){
            time[i]=scn.nextInt();
        }
        //処理
        int min_no1=9;
        int place=0;
        int cnt=0;
        int total=0;
        for(int i=0;i<5;i++){
            if(time[i]%10!=0){
                if( min_no1>time[i]%10) {
                    min_no1=time[i]%10;
                    place=i;
                }
            }else{
                cnt++;
            }
        }
        if(cnt==5)min_no1=0; 

        for(int i=0;i<5;i++){
            if(time[i]%10==0||place==i){
                total+=time[i];
            }else{
                total+=time[i]-time[i]%10+10;
            }
        }
        //出力
        System.out.println(total);
    }
}
