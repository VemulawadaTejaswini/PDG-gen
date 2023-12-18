import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = line.split(" ");
        int nfig = Integer.parseInt(linesp[0]);
        int afig = Integer.parseInt(linesp[1]);
        int bfig = Integer.parseInt(linesp[2]);
        int cfig = Integer.parseInt(linesp[3]);
        int dfig = Integer.parseInt(linesp[4]);

        int xmin=0;
        int ymin=0;

        if(nfig%afig==0) {
        	xmin = (nfig/afig)*bfig;
        }else {
        	xmin = ((nfig/afig)+1)*bfig;
        }

        if(nfig%cfig==0) {
        	ymin = (nfig/cfig)*dfig;
        }else {
        	ymin = ((nfig/cfig)+1)*dfig;
        }

        if(xmin>ymin) {
        	System.out.println(ymin);
        }else {
        	System.out.println(xmin);
        }


    }
}
