import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,n,x,count=0;
        for(i=0;;i++){
            n=sc.nextInt();
            x=sc.nextInt();
            if((n==0)&&(x==0)){
                break;
            }else{
                for(j=1;j<=n-2;j++){
                    for(k=j+1;k<=n-1;k++){
                        for(l=k+1;l<=n;l++){
                            if(j+k+l==x){
                                count += 1;
                            }
                        }
                    }
                }
                System.out.println(count);
                count=0;
            } 
        }
    }
}
