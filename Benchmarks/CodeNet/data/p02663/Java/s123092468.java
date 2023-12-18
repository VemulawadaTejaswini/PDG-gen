import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
      
  Scanner scan=new Scanner(System.in);
        int h1,m1,h2,m2,k;
        h1=scan.nextInt();
        m1=scan.nextInt();
        h2=scan.nextInt();
        m2=scan.nextInt();
        k=scan.nextInt();
        
        int time1=(h2*60+m2)-k;
        int period=time1-(h1*60+m1);
        System.out.println(period);
    }}