public class Main{
  public static void main(String[] args){
    int n = new java.util.Scanner(System.in).nextInt();

    for (int i=0; ;i++){
      int tmp = (i+1)*1000 - n;
      if (tmp >= 0){
        System.out.println(tmp);
        break;
      }
    }
  }
}
