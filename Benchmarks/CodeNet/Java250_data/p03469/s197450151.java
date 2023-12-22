import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String[] number=S.split("/",0);
        number[0]="2018";
        System.out.println(number[0]+"/"+number[1]+"/"+number[2]);


    }
}
