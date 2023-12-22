import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        long sum=0;
        char ch[]=s.toCharArray();
        for (int i = 0; i <s.length(); i++) {
            sum+=(int)ch[i]-48;
        }
        if(sum%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
}
}