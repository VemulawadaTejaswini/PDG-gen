public class Main {
  
  static char[] arr = ("abcdefghijklmnopqrstuvwxyz").toCharArray(); 
  
  public static void main(String[] args){
    long N = new java.util.Scanner(System.in).nextLong();

    System.out.println(getName(N, ""));
  }
  
  private static String getName(long n, String str) {
    long syo = n / 26L;
    int yo = (int)(n % 26L);
    
    if (yo == 0) {
      yo = 26;
      syo -= 1;
    }

    str = String.valueOf(arr[yo - 1]) + str;
    
    if (syo == 0) {
      return str;
    }
    return getName(syo, str);
  }
}
