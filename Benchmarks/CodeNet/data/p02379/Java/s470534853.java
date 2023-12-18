import java.util.Scanner;

class Main{
    
    public static double mathmet(double X1,double Y1,double X2,double Y2){
        
        double rt = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));
        
        return rt;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
       System.out.println(mathmet(x1,y1,x2,y2)); 
        
       sc.close();
    }
}
