import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N=sc.next();
        int A=Integer.parseInt(N);
        int leng=N.length();
        int ans=0;
        for(int i=0;leng>i;i++){
            char s=N.charAt(i);
            ans+=Integer.parseInt(""+s);
        }
        if(A%ans==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}