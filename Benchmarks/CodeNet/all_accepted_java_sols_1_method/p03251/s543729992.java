import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z1=-101;
        int z2=101;
        int flag=1;
        for(int i=0;i<n;i++){
            int buf =scn.nextInt();
            z1=Math.max(z1,buf);
        }
        for(int i=0;i<m;i++){
            int buf=scn.nextInt();
            z2=Math.min(z2,buf);
        }
        for(int i=x+1;i<=y;i++){
            if(z1<i&&i<=z2){
                flag=0;
                break;
            }
        }
        if(flag==0){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
    }
}