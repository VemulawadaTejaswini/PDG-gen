import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int r=sc.nextInt();
            if(n==0 && r==0){
                break;
            }
            int []num=new int[n];
            
            for(int i=0;i<n;i++){
                num[i]=n-i;
            }
            for(int i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                for(int j=0;j<c;j++){
                    for(int k=0;k<=p-1;k++){
                        int temp=num[p-1+j];
                        num[p-1+j]=num[k+j];
                        num[k+j]=temp;
                    }
                }
            }
            System.out.println(num[0]);
        }
    }
}