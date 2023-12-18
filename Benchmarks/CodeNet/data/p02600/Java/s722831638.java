import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=0;
        if(400<=x&&x<=599){n=8;}
        if(600<=x&&x<=799){n=7;}
        if(800<=x&&x<=999){n=6;}
        if(1000<=x&&x<=1199){n=5;}
        if(1200<=x&&x<=1399){n=4;}
        if(1400<=x&&x<=1599){n=3;}
        if(1600<=x&&x<=1799){n=2;}
        if(1800<=x&&x<=1999){n=1;}
        System.out.println(""+n);
        }
}