import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        char[] num=new char[line.length()];
        for(int i=0;i<num.length;i++){
            if(line.charAt(i)=='1')
                num[i]='9';
            else if(line.charAt(i)=='9')
                num[i]='1';
            else
                num[i]=line.charAt(i);
            System.out.print(num[i]);
        }
        System.out.println();
    }
}
