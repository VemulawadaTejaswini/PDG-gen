import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int i,j;
        for(i=0;i<str.length();i++){
            for(j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}