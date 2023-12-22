import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=sc.nextInt();
            }
        }
        int a=0;
        int aa=c[0][0]+c[0][1]-c[1][0]-c[1][1];
        int ab=c[0][0]+c[0][2]-c[1][0]-c[1][2];
        int ac=c[0][1]+c[0][2]-c[1][1]-c[1][2];
        if((aa==ab)&&(ab==ac)){
            a=1;
        }
        int b=0;
        int ba=c[1][0]+c[1][1]-c[2][0]-c[2][1];
        int bb=c[1][0]+c[1][2]-c[2][0]-c[2][2];
        int bc=c[1][1]+c[1][2]-c[2][1]-c[2][2];
        if((ba==bb)&&(bb==bc)){
            b=1;
        }
        int d=0;
        int da=c[0][0]+c[1][0]-c[0][1]-c[1][1];
        int db=c[0][0]+c[2][0]-c[0][1]-c[2][1];
        int dc=c[1][0]+c[2][0]-c[1][1]-c[2][1];
        if((da==db)&&(db==dc)){
            d=1;
        }
        int f=0;
        int fa=c[0][1]+c[1][1]-c[0][2]-c[1][2];
        int fb=c[0][1]+c[2][1]-c[0][2]-c[2][2];
        int fc=c[1][1]+c[2][1]-c[1][2]-c[2][2];
        if((fa==fb)&&(fb==fc)){
            f=1;
        }
        if((a==1)&&(b==1)&&(d==1)&&(f==1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }







        }
        
     
    }
