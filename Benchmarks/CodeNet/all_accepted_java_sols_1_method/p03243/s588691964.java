import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%111==0){
            System.out.println(N);
        }
        else{
            System.out.println((N/111+1)*111);
        }
    }
}
