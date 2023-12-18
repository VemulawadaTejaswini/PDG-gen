
public class XCubic {
    public static void GetCubed(int num){
      int n = (int)Math.pow(num, 3);
      System.out.println(n);
    }

    public static void main(String[] args){
      GetCubed(Integer.parseInt(args[0]));
    }
}