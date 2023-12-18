import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        String xStr = scanner.nextLine();
        String yStr = scanner.nextLine();
            
        String xArr[] = xStr.split(" ");
        String yArr[] = yStr.split(" ");
          
        double p1 = 0;
        double p2 = 0;
        double p3 = 0; 
        double p9 = 0;
        
        for (int i=0; i<xArr.length;i++) {
                p1 += Math.abs( Double.parseDouble(xArr[i]) - Double.parseDouble(yArr[i]) );
                p2 += Math.pow( Math.abs( Double.parseDouble(xArr[i]) - Double.parseDouble(yArr[i]) ), 2);
                p3 += Math.pow( Math.abs( Double.parseDouble(xArr[i]) - Double.parseDouble(yArr[i]) ), 3);
                if( p9 <= Math.abs( Double.parseDouble(xArr[i]) - Double.parseDouble(yArr[i])) ) p9 = Math.abs( Double.parseDouble(xArr[i]) - Double.parseDouble(yArr[i]));
        }
        
        System.out.println(String.format("%.8f", p1));
        System.out.println(String.format("%.8f", Math.sqrt(p2)));
        System.out.println(String.format("%.8f", Math.cbrt(p3)));
        System.out.println(String.format("%.8f", Math.abs(p9)));
    }
}
