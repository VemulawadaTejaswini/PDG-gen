import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        String moji=sc.nextLine();
        char[] a=moji.toCharArray();
        if((a[0]==a[1]&&a[1]==a[2])||(a[1]==a[2]&&a[2]==a[3])){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }

        
        
        


    }
}
