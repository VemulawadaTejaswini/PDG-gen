import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       int N=scan.nextInt();
       int H=N%10;
       if (H==1){System.out.println("pon");}
        if (H==2){System.out.println("hon");}
        if (H==3){System.out.println("bon");}
        if (H==4){System.out.println("hon");}
        if (H==5){System.out.println("hon");}
        if (H==6){System.out.println("pon");}
        if (H==7){System.out.println("hon");}
        if (H==8){System.out.println("pon");}
        if (H==9){System.out.println("hon");}
        if (H==0){System.out.println("pon");}


    }

}

