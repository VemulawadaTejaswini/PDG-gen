import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] c=new int[a];
        int sum=0;
        for(int i=0;i<a;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<=a-2;i++){
            for(int j=i+1;j<=a-1;j++){
                sum+=c[i]*c[j];
            }
        }
        System.out.println(sum);
    }
}
