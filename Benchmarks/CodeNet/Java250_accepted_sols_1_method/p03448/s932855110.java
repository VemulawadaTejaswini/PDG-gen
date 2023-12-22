import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []a=new int[4];
        int c=0;
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a[0];i++){
            for(int j=0;j<=a[1];j++){
                for(int k=0;k<=a[2];k++){
                    if(a[3]==500*i+100*j+50*k){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}