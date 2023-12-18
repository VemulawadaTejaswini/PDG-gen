import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int check=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R' && i%2!=0){
                check++;
                break;
            }else if(s.charAt(i)=='L' && i%2==0){
                check++;
                break;
            }
        }
        if(check==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}