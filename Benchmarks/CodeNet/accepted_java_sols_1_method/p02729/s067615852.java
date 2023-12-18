import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,m,tmpN,tmpM;
        n=scan.nextInt();
        m=scan.nextInt();
        tmpM=0;
        tmpN=0;
        for(int i=1;i<n;i++){
            tmpN +=i;
        }
        for(int i=1;i<m;i++){
            tmpM += i;
        }
        System.out.println(tmpM+tmpN);
    }
}