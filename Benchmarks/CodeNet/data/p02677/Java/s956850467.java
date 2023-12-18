import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    double A=s.nextDouble();
    double B=s.nextDouble();
    double H=s.nextDouble();
    double M=s.nextDouble();

    double Atheta=((60*H+M)/360)*Math.PI;
    double Btheta=(M/30)*Math.PI;
    double deltaA=Math.pow((A*(Math.cos(Atheta))-B*(Math.cos(Btheta))),2);
    double deltaB=Math.pow((A*(Math.sin(Atheta))-B*(Math.sin(Btheta))),2);
    
    System.out.println(Math.sqrt(deltaA+deltaB));
  }  
}