import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i,N,j,div,mod,k;
        N=sc.nextInt();
        for(i=1;i<=N;i++){
            if(i%3==0){
                System.out.print(" "+i);
            }else{
                k=i;
                for(j=0; ;j++){
                    div=k/10;
                    mod=k%10;
                    if((div==3)||(mod==3)){
                        System.out.print(" "+i);
                        break;
                    }
                    k=div;
                    if(div==0){
                        break;
                    }
                }
            }               
        }
        System.out.println();   
    }
}
