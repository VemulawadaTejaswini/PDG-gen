import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            int buf=scn.nextInt();
            if(i==0){
                max=min=buf;
            }else{
                max=Math.max(buf,max);
                min=Math.min(buf,min);
            }
        }
        System.out.println(max-min);
    }
}
