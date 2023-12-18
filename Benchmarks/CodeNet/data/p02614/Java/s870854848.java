import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int H=sc.nextInt(),W=sc.nextInt(),K=sc.nextInt(),res=0;
        char[][] c=new char[H][W];
        for(int i=0;i<H;i++){
            String t=sc.next();
            for(int j=0;j<W;j++){
                c[i][j]=t.charAt(j);
            }
        }
        for(int i=0;i<1<<H;i++){
            for(int j=0;j<1<<W;j++){
                int d=0;
                for(int k=0;k<H;k++){
                    for(int l=0;l<W;l++){
                        if((((i>>k)&1)==0)&&(((j>>l)&1)==0)&&c[k][l]=='#'){
                            d++;
                        }
                    }
                }
                if(d==K){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
