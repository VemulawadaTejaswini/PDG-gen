import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int w=scan.nextInt();
        int h=scan.nextInt();
        int n=scan.nextInt();
        boolean [][]color=new boolean[w][h];
        int x,y,a;
        for(int i=0;i<n;i++){
            x=scan.nextInt();
            y=scan.nextInt();
            a=scan.nextInt();
            if(a==1){
                for(int j=x-1;j>=0;j--){
                    for(int k=0;k<h;k++)
                    color[j][k]=true;
                }
            }
            if(a==2){
                for(int j=x;j<w;j++){
                    for(int k=0;k<h;k++)
                        color[j][k]=true;
                }
            }
            if(a==3){
                for(int j=y-1;j>=0;j--){
                    for(int k=0;k<w;k++)
                        color[k][j]=true;
                }
            }
            if(a==4){
                for(int j=y;j<h;j++){
                    for(int k=0;k<w;k++)
                        color[k][j]=true;
                }
            }
        }
        int ans=0;
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(!color[i][j])
                    ans++;
            }
        }

        System.out.println(ans);
    }
}