import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      String str1 = br.readLine();
      int[] digit = new int[str1.length()];
      int sum = 0;
      for(int i = 0; i < str1.length(); i++){
        digit[i] = Character.getNumericValue(str1.charAt(i));
        sum += digit[i];
      }
      if (sum == 0) {break;}
      else
        System.out.println(sum);
    }
  }
}