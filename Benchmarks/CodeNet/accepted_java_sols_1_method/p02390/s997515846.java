public class Main{
  public static void main(String[] args){
    int input= new java.util.Scanner(System.in).nextInt();
    int h=input/3600;
    int m=(input-h*3600)/60;
    int s=input-h*3600-m*60;
    System.out.println(h+":"+m+":"+s);
}
}

