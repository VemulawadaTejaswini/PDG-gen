import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] num=line.split("");
        int tar=Integer.parseInt(num[num.length-1]);
        if(tar==2||tar==4||tar==7||tar==9){
            System.out.println("hon");
        }else if(tar==3){
            System.out.println("bon");
        }else{
            System.out.println("pon");
        }
    }
}
