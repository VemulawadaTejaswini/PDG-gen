public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double C=scanner.nextDouble();
        
        double cosC=Math.cos(C * (Math.PI / 180));
        double sinC=Math.sin(C * (Math.PI / 180));
        double menseki=a*b*cosC;
        
        double x2=b*cosC;
        double y2=b*sinC;
        
        double deltax=(x2-a)*(x2-a);
        double deltay=(y2)*(y2);
        
        System.out.println(menseki);
        double kyori=Math.sqrt(deltax+deltay);
        System.out.println(kyori+a+b);
        
        System.out.println(b*sinC);
    }
}