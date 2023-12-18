import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    while(true){
      String str = br.readLine();
      int[] digits = new int[str.length()];

      for (int i = 0; i < str.length(); i++){
        digits[i] = Character.getNumericValue(str.charAt(i));
        sum += digits[i];
      }
      if (str.equals("0")){break;}
    }
    System.out.println(sum);
  }
}