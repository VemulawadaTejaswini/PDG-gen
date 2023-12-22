import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=0; 
        double sum=0;
        for(int i=0; i<a;i++){
            b=sc.nextDouble();
            sum+=1/b;
        }
        System.out.println(1/sum);
    }
    
}
