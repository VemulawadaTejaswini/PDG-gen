import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int dollar = scn.nextInt();
        int cake =4;
        int donut=7;
        int outFlag=0;
        for(int i=0;i<26;i++){
            for(int j=0;;j++){
                int total = cake*i+donut*j;
                if(total==dollar){
                    outFlag++;
                    break;
                }else if(total>dollar){
                    break;
                }
            }
        }
        if(outFlag>0){
            System.out.println("Yes");
        }else{
            System.out.print("No");
        }

    }
}