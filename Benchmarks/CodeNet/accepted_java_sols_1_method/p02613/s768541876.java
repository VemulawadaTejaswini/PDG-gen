import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    String[] result = new String[n];
    for(int i = 0; i < result.length; i++){
      result[i] = sc.next();
    }

    //output
    int acCount = 0;
    int tleCount = 0;
    int waCount = 0;
    int reCount = 0;
    for(int i = 0; i < result.length; i++){
      if( result[i].equals("AC") ){
        acCount++;
      }else if( result[i].equals("TLE") ){
        tleCount++;
      }else if( result[i].equals("WA") ){
        waCount++;
      }else if( result[i].equals("RE") ){
        reCount++;
      }
    }
    System.out.println("AC x "+acCount);
    System.out.println("WA x "+waCount);
    System.out.println("TLE x "+tleCount);
    System.out.println("RE x "+reCount);


  }
}
