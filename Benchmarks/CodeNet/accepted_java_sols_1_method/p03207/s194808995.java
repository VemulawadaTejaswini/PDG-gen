import java.util.Scanner;

class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n;
        int p[]=new int[20];
        n=sc.nextInt();
        int max=-99999999,max_i=0;
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            if(p[i]>max){
                max=p[i];
                max_i=i;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==max_i)continue;
            ans+=p[i];
        }
        System.out.println(ans+max/2);
        
    }
}