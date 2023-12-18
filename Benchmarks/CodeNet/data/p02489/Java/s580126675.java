import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int []a=new int[10000];
         for(int j=0;;j++){
            a[j]=sc.nextInt();
                if(a[j]==0){
                    break;
                }
         }
        for(int i=0;;i++){
            int b=a[i];
            if(b==0){
                break;
            }else{
            System.out.println("Case "+(i+1)+": "+b);
            }
        }
    }
}