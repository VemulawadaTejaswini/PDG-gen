import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        if(s.length()<=k){
            System.out.println(s);
        }else{
            char ch[]=s.toCharArray();
            for (int i = 0; i < k; i++) {
                System.out.print(ch[i]);
            }
            System.out.println("...");
        }
    }
}