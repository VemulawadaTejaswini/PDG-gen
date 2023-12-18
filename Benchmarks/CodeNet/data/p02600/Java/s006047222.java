import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
     int p=0;

if (N<=599){p=8;}
else if(N<=799){p=7; }
else if(N<=999){p=6; }
else if(N<=1199){p=5; }
else if(N<=1399){p=4; }
else if(N<=1599){p=3; }
else if(N<=1799){p=2; }
else if(N<=1999){p=1; }
     
System.out.println(p);
}
    }
