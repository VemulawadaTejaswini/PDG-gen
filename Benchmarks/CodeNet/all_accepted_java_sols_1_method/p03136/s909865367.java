import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        int c=0;
        int sum=0;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
            c=Math.max(c,b[i]);
            sum+=b[i];
        }
        if(c<sum-c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
