import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int height=scan.nextInt();
        int width=scan.nextInt();
        String[] str=new String[height];
        int i;
        for(i=0;i<height;i++){
            str[i]=scan.next();
        }
        String top="#";
        for(i=0;i<=width;i++){
            top=top+"#";
        }
        System.out.println(top);
        for(i=0;i<height;i++){
            System.out.println("#"+str[i]+"#");
        }
        System.out.println(top);
    }
}