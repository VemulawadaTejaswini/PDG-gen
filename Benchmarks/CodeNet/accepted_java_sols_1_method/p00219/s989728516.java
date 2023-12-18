import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int p[]=new int[10];
            for(int i=0;i<10;i++){
                p[i]=0;
            }
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                p[x]++;
            }
            for(int i=0;i<10;i++){
                if(p[i]==0){
                    System.out.println("-");
                }else{
                    for(int j=0;j<p[i];j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
