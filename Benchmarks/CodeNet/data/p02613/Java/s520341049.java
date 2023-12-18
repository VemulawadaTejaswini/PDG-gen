public class Main{
  public static void main(String[] args){
    int n = new java.util.Scanner(System.in).nextInt();

    int ac=0, wa=0, tle=0, re=0;

    for (int i=0; i<n; i++){
      String tmp = new java.util.Scanner(System.in).nextLine();
      if (tmp.equals("AC")){
        ac++;
      }else if (tmp.equals("WA")){
        wa++;
      }else if (tmp.equals("TLE")){
        tle++;
      }else if (tmp.equals("RE")){
        re++;
      }else {
        System.out.println("error");
      }
    }
    System.out.println("AC x "+ac);
    System.out.println("WA x "+wa);
    System.out.println("TLE x "+tle);
    System.out.println("RE x "+re);
  }
}
